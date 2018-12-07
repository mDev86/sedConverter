package conv;

import conv.Exceptions.CustomWorkExceptions;
import conv.POJO.docInfo.DocumentInfo;
import conv.POJO.esd.ESD;
import conv.Utils.ESDConverter;
import conv.Utils.XMLReader;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        final String basePath;
        final String messageId;
        final String returnId;
        final Boolean Dit2Dir;

        try {
            basePath = args[0];
            returnId = args[1];
            Dit2Dir = Boolean.valueOf(args[2]);
            messageId = args[3];
        } catch (Exception e){
            System.err.println("Неправильный вызов утилиты: неверный набор параметров - [Путь до рабочей папки] [returnId] [Dit2Dir] [messageId]");
            System.exit(-1);
            return;
        }

        System.setProperty("returnId", returnId);
        System.setProperty("basePath", basePath);
        System.setProperty("startPath", new File(App.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent());

        Logger log = LogManager.getRootLogger();

        log.info(String.format("Запуск утилиты. Преобразование %s.", Dit2Dir?"Дело->Directum":"Directum->Дело"));

        try {
            if(Dit2Dir) {
                DitToDir(basePath);
            }else{
                DirToDit(basePath, returnId, messageId);
            }
            log.info(String.format("Преобразование файлов %s успешно выполнено.", Dit2Dir?"Дело->Directum":"Directum->Дело"));
        } catch (CustomWorkExceptions customWorkExceptions) {
            log.error(customWorkExceptions, customWorkExceptions.fillInStackTrace());
            Logger onlyLog = LogManager.getLogger("error");
            onlyLog.error(customWorkExceptions, customWorkExceptions.fillInStackTrace());
            System.exit(1);
        }catch (RuntimeException err){
            log.error(err, err.fillInStackTrace());
            Logger onlyLog = LogManager.getLogger("error");
            onlyLog.error(err, err.fillInStackTrace());
            System.exit(1);
        }

    }

    private static void DitToDir(String basePath) throws CustomWorkExceptions {
        String pathIn =  basePath + "\\in";
        String pathOut = basePath + "\\out";

        File CatIn = new File(pathIn);
        File[] files = CatIn.listFiles((dir, name) -> FilenameUtils.getExtension(name).equalsIgnoreCase("xml"));

        if(files == null){
            throw new CustomWorkExceptions(String.format(String.format("Dit2Dir: В указанном каталоге \"%s\" нет файлов с расширением .xml", CatIn.getPath())),  null);
        }

        File docInfo = Arrays.stream(files).filter(it -> {
                return
                        it.getName().equalsIgnoreCase("docinfo.xml")
                                || it.getName().equalsIgnoreCase("documentinfo.xml");
            })
            .findFirst()
            .orElse(null);

        if(docInfo == null){
            throw new CustomWorkExceptions(String.format("Dit2Dir: Файл docinfo.xml не найден"),  null);
        }

        DocumentInfo documentInfo = XMLReader.loadDocInfoFromXml(docInfo);

        for(ESD esd: documentInfo.toESD(pathIn)){
            try {
                esd.saveToFile(pathOut);
            } catch (JAXBException e) {
                throw new CustomWorkExceptions("Dit2Dir: Ошибка при сохранении esd файла", e);
            }
        }
    }

    private static void DirToDit(String basePath, String returnId, String messageId) throws CustomWorkExceptions {
        String pathIn = Paths.get(basePath, "in").toString();
        String pathOut = Paths.get(basePath, "out").toString();
        new File(pathOut).mkdir();

        List<ESD> esds = XMLReader.loadESDFiles(pathIn);

        if (esds == null || esds.size() ==0) {
            throw new CustomWorkExceptions(String.format("DirToDit: Файлы *.esd не найдены в дрректории \"%s\"", pathIn));
        }

        ESDConverter.convert(esds, pathOut, returnId, messageId);
    }

}
