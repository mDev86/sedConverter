package conv;

import conv.POJO.SigInfo;
import conv.POJO.SignType;
import conv.POJO.docInfo.DocumentInfo;
import conv.POJO.docInfo.EDS;
import conv.POJO.esd.ESD;
import conv.Utils.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.bouncycastle.cms.CMSException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.*;
import java.net.URL;
import java.text.ParseException;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        String pathwork = "C:\\tmp\\1962\\in\\";
        String pathoutwork = "C:\\tmp\\1962\\out";
        String returnId = UUID.randomUUID().toString().replace("-", "");
        String messageId = UUID.randomUUID().toString().replace("-", "");

        Config.getInstance();

        System.out.println(System.getProperty("conf\\user.dir"));
        File folder = new File("Sender.xml");
        try {
            folder.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(folder.exists());

        List<ESD> esds = null;
        try {
            esds = XMLReader.loadESDFiles(pathwork);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ESDConverter.convert(esds, pathoutwork, returnId, messageId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //DitToDir();
/*
        try {
            Config instance = Config.getInstance();

            System.out.println("asd");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //System.out.println(SignType.getName(2));

        //System.out.println(SignType.valueOf("approving").getIndex());

       /* String pathwork = "C:\\Users\\SlobodenukSS\\Documents\\Projects\\TestConvertFile\\test.docx";
        String pathwork1 = "C:\\Users\\SlobodenukSS\\Documents\\Projects\\TestConvertFile\\test1.docx";

        try {
            String str = FileConvert.FileToBase64(new File(pathwork));
            FileConvert.Base64ToFile(str, pathwork1);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       /* String pathwork = "C:\\Users\\SlobodenukSS\\Documents\\Projects\\TestConvertFile\\in1";
        //String pathoutwork = "C:\\Users\\SlobodenukSS\\Documents\\Projects\\TestConvertFile\\out";

        //String pathworkfile = "C:\\Users\\SlobodenukSS\\Documents\\Projects\\TestConvertFile\\in1\\test.doc.sig";

        File f = new File(pathwork, "test.sig");

        try {
            SigInfo parse = (new SigParser(f)).parse();
            System.out.println("asd");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CMSException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

      /*  try {
            String base = FileConvert.FileToBase64(pathworkfile);

            DigitalSignatures signs = new DigitalSignatures();

            DigitalSignature sign = new DigitalSignature();
            sign.setData(base);
            signs.getDigitalSignature().add(sign);
            ;
            Header header = new Header();
            header.setName("TestFile");

            ESD esd = new ESD();
            esd.setVersion(BigDecimal.valueOf(2.0));
            esd.setMetadataID("");
            esd.setMetadataVersion("");
            esd.setHeader(header);
            esd.setDigitalSignatures(signs);

            esd.saveToXML(pathoutwork);

            System.out.println(base);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }*/

     /*   XMLReader reader = new XMLReader(pathwork);
        List<ESD> esds = reader.loadAllEsd();

        for(ESD esd : esds){
            try {
                esd.saveToXML(pathoutwork);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
            *//*try {
                esd.extractFile(pathoutwork);

            } catch (IOException e) {
                e.printStackTrace();
            }*//*
        }*/

/*

        try {
            File file = new File("C:\\Users\\SlobodenukSS\\Documents\\Projects\\convert\\src\\main\\resources\\test.docx.sig");
            byte[] bf = Files.readAllBytes(file.toPath());

            ASN1InputStream bIn = new ASN1InputStream(new ByteArrayInputStream(bf));
            ASN1Primitive object = bIn.readObject();




            DERApplicationSpecific app = (DERApplicationSpecific) object;
            ASN1Sequence seq = (ASN1Sequence) app.getObject(BERTags.SEQUENCE);
            Enumeration secEnum = seq.getObjects();
            while (secEnum.hasMoreElements()) {
                ASN1Primitive seqObj = (ASN1Primitive) secEnum.nextElement();
                System.out.println(seqObj);
            }

            System.out.println(ASN1Dump.dumpAsString(object));
            System.out.println("sss");
        } catch (IOException e) {
            e.printStackTrace();
        }
*/



/*
        ESD obj = new conv.POJO.esd.ESD();
        Header h = new Header();
        h.setAuthor("adasd");
        h.setName("qqqqq");
        obj.setHeader(h);*/

        /*Create XML*/
        /*File file = new File("test.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ESD.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(obj, file);
            marshaller.marshal(obj, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }*/

        /*Read XML*/
       /* try {

            File file = new File("C:\\Users\\SlobodenukSS\\Documents\\Projects\\convert\\src\\main\\resources\\test.esd");
            JAXBContext jaxbContext = JAXBContext.newInstance(ESD.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ESD objj = (ESD) jaxbUnmarshaller.unmarshal(file);
            System.out.println(objj);
            ExtractFiles(objj);
        } catch (JAXBException e) {
            e.printStackTrace();
        }*/

      /*  DocumentInfo doc = new DocumentInfo();
        MessageHeader docHead = new MessageHeader();
        docHead.setVersion("1.0");
        doc.setHeader(docHead);
        *//*Write docinfo.xml*//*
        File file1 = new File("testdocinfo.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DocumentInfo.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            //marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(doc, file1);
            marshaller.marshal(doc, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }*/

        /*Read docinfo.XML*/
     /*   try {

            FileInputStream file = new FileInputStream("C:\\Users\\SlobodenukSS\\Documents\\Projects\\convert\\src\\main\\resources\\docinfo.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(DocumentInfo.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Source source = new StreamSource(file);
            JAXBElement<DocumentInfo> root = jaxbUnmarshaller.unmarshal(source, DocumentInfo.class);
            DocumentInfo foo = root.getValue();


          //  DocumentInfo objj = (DocumentInfo) jaxbUnmarshaller.unmarshal(file);
            System.out.println(foo);

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

    }

    private static void DitToDir(){
        String path = "C:\\Users\\SlobodenukSS\\Documents\\Projects\\TestConvertFile\\in";
        String pathOut = "C:\\Users\\SlobodenukSS\\Documents\\Projects\\TestConvertFile\\out";


        File CatIn = new File(path);
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
            //TODO: Вывод в лого том что отсутствует файл docInfo.xml
            return;
        }

        try {
            DocumentInfo documentInfo = XMLReader.loadDocInfoFromXml(docInfo);

            /*List<ESD> esds = documentInfo.toESD(path);
            esds.get(0).extractFile(pathOut);*/

            documentInfo.toESD(path).forEach(it -> {
                try {
                    it.saveToFile(pathOut);
                } catch (JAXBException e) {
                    //TODO: Вывод в лого том что не удалось сохранить файл в esd
                    e.printStackTrace();
                    return;
                }
            });

            System.out.println("asdasd");

        } catch (FileNotFoundException e) {
            //TODO: Вывод в лого том что отсутствует файл docInfo.xml
            e.printStackTrace();
        } catch (JAXBException e) {
            //TODO: Вывод в лого том что возникла ошибка преобразования файла docInfo.xml
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CMSException e) {
            e.printStackTrace();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        System.out.println("asd");

    }




}
