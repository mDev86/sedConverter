package conv.Utils;

import conv.POJO.docInfo.DocumentInfo;
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

    public static List<ESD> loadAllEsd(String pathWorkDirectory){
        List<ESD> object = new ArrayList<ESD>();
        try {
            Stream<Path> streams = Files.find(Paths.get(pathWorkDirectory), 1, (path, attr) -> FilenameUtils.getExtension(path.getFileName().toString()).equalsIgnoreCase("esd"));

            for(Path path : streams.collect(Collectors.toList())){
                File file = path.toFile();

                System.out.println(file.getName());

                if(file.exists()
                        && file.isFile()
                        && FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("esd"))
                {
                    try {
                        JAXBContext jaxbContext = JAXBContext.newInstance(ESD.class);
                        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                        object.add((ESD) jaxbUnmarshaller.unmarshal(file));
                    } catch (JAXBException e) {
                        e.printStackTrace();
                        //TODO: Залогировать ошибку
                        return null;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            //TODO: Залогировать ошибку
            return null;
        }

        return object;
    }

    public static DocumentInfo loadDocInfoFromXml(File _file) throws FileNotFoundException, JAXBException {
        FileInputStream file = new FileInputStream(_file);

        JAXBContext jaxbContext = JAXBContext.newInstance(DocumentInfo.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Source source = new StreamSource(file);
        JAXBElement<DocumentInfo> root = jaxbUnmarshaller.unmarshal(source, DocumentInfo.class);
        return root.getValue();
    }

}
