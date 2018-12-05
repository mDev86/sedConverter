package conv.Utils;

import conv.Exceptions.CustomWorkExceptions;
import conv.POJO.docInfo.DocumentInfo;
import conv.POJO.docInfo.Sender;
import conv.POJO.esd.ESD;
import org.apache.commons.io.FilenameUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class XMLReader {

    public static List<ESD> loadESDFiles(String path) throws Exception {
        List<ESD> result = new ArrayList<>();

        List<File> files = null;
        try {
            files = Files.walk(Paths.get(path)).
                    filter(file -> file.toString().toLowerCase().endsWith(".esd")).map(Path::toFile).collect(Collectors.toList());
        } catch (IOException e) {
            throw new Exception(String.format("Ошибка чтения директории \"%s\"", path), e);
        }

        JAXBContext context = JAXBContext.newInstance(ESD.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        for (File f: files) {
            try {
                result.add((ESD) unmarshaller.unmarshal(f));
            } catch (JAXBException e) {
                throw new Exception(String.format("Ошибка десериализации файла \"%s\"", f.getName()), e);
            }

        }

        return result;
    }

    public static DocumentInfo loadDocInfoFromXml(File _file) throws CustomWorkExceptions {
        FileInputStream file = null;
        try {
            file = new FileInputStream(_file);

            JAXBContext jaxbContext = JAXBContext.newInstance(DocumentInfo.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Source source = new StreamSource(file);
            JAXBElement<DocumentInfo> root = jaxbUnmarshaller.unmarshal(source, DocumentInfo.class);
            return root.getValue();
        } catch (FileNotFoundException e) {
            throw new CustomWorkExceptions(String.format("Файл \"%s\" не найден", _file), e);
        } catch (JAXBException e) {
            throw new CustomWorkExceptions(String.format("Ошибка считывания(парсинга) файла \"%s\"", _file), e);
        }
    }
}
