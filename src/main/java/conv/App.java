package conv;

import conv.Exceptions.CustomWorkExceptions;
import conv.POJO.docInfo.DocumentInfo;
import conv.POJO.esd.ESD;
import conv.Utils.XMLReader;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Logger log = LogManager.getRootLogger();
        Logger onlyLog = LogManager.getLogger("error");

        final String basePath;
        final String messageId;
        final String returnId;
        final Boolean Dit2Dir;

        try {
            basePath = args[0];
            returnId = args[1];
            Dit2Dir = Boolean.valueOf(args[2]);
            messageId = args[3];
        }catch (Exception e){
            log.error("Неправильный вызов утилиты: неверный набор параметров.");
            return;
        }

        System.setProperty("returnId", returnId);
        System.setProperty("basePath", basePath);

        log.info(String.format("Запуск утилиты. Преобразование %s.", Dit2Dir?"Дело->Directum":"Directum->Дело"));

        try {
            if(Dit2Dir) {
                DitToDir(basePath);
            }else{
                //TODO: Тут вызов Dir -> Dit
            }
        }catch (CustomWorkExceptions customWorkExceptions) {
            log.error(customWorkExceptions, customWorkExceptions.fillInStackTrace());
            onlyLog.error(customWorkExceptions, customWorkExceptions.fillInStackTrace());
            System.out.println("error");
            System.exit(1);
        }

    }

    private static void DitToDir(String basePath) throws CustomWorkExceptions {
        String pathIn =  basePath + "\\in";
        String pathOut = basePath + "\\out";


        File CatIn = new File(pathIn);
        File[] files = CatIn.listFiles((dir, name) -> FilenameUtils.getExtension(name).equalsIgnoreCase("xml"));

        File docInfo = Arrays.stream(files).filter(it -> {
                System.out.println(it.getName());
                return
                        it.getName().equalsIgnoreCase("docinfo.xml")
                                || it.getName().equalsIgnoreCase("documentinfo.xml");
            })
            .findFirst()
            .orElse(null);

        if(docInfo == null){
            throw new CustomWorkExceptions(String.format("Файл docinfo.xml не найден"),  null);
        }

        DocumentInfo documentInfo = XMLReader.loadDocInfoFromXml(docInfo);

        for(ESD esd: documentInfo.toESD(pathIn)){
            try {
                esd.saveToFile(pathOut);
            } catch (JAXBException e) {
                throw new CustomWorkExceptions("Ошибка при сохранении esd файла", e);
            }
        }
    }

}
