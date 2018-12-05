package conv.Utils;

import conv.POJO.DeloConfig;
import conv.POJO.SignType;
import conv.POJO.docInfo.*;
import conv.POJO.esd.DigitalSignature;
import conv.POJO.esd.ESD;
import org.apache.commons.io.FilenameUtils;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.*;

public class ESDConverter {

    public static ESD getMain(List<ESD> esds) {
        for (ESD esd: esds) {
            if (!esd.getHeader().getNumber().isEmpty())
                return esd;
        }

        return null;
    }

    public static void convert(List<ESD> esds, String outpuPath, String returnId, String messageId) throws Exception {
        DocumentInfo result = new DocumentInfo();
        DeloConfig deloConfig = Config.getInstance().getDeloCofig();
        ESD main = getMain(esds);

        if (main == null) {
            throw new Exception("Ошибка определения главного документа");
        }

        MessageHeader header = new MessageHeader();
        result.setHeader(header);

        header.setResourceID(0);
        header.setMessageType(DocumentMessageType.MAIN_DOC);
        header.setVersion("1.0");

        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        gCalendar.setTime(new Date());
        header.setTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar));

        header.setReturnID(returnId);
        header.setMessageID(messageId);

        header.setSender(deloConfig.getSender());
        header.setRecipient(deloConfig.getRecipient());

        ResourceInfo riDI = new ResourceInfo();
        riDI.setUID("0");
        riDI.setUniqueName("DocInfo.xml");

        ResourceList rl = new ResourceList();
        rl.getResource().add(riDI);

        DocumentList dl = new DocumentList();
        result.setDocumentList(dl);

        Document doc = new Document();
        doc.setUID(main.getHeader().getGlobalID().replace("-", "").substring(1, 32));
        doc.setType(DocumentType.CREATED);
        doc.setMainDocument(true);
        //doc.setDocumentID(main.getExtAttributes().getID().getValue());
        doc.setDocumentID(main.getHeader().getSourceEDocumentID());

        Group docGroup = new Group();
        docGroup.setValue("Письма исходящие (официальные)");
        doc.setGroup(docGroup);

        Access docAccess = new Access();
        docAccess.setUID("001");
        docAccess.setValue("общий");
        doc.setAccess(docAccess);

        doc.setAnnotation(main.getHeader().getName());
        doc.setNote(main.getHeader().getNote());

        RegistrationInfo regInfo = new RegistrationInfo();
        regInfo.setNumber(main.getHeader().getNumber());
        XMLGregorianCalendar regInfoDate = main.getHeader().getDate();
        regInfoDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        regInfo.setDate(regInfoDate);

        doc.setRegistrationInfo(regInfo);
        dl.getDocument().add(doc);

        for (ESD esd: esds) {
            ResourceInfo ri = new ResourceInfo();

            DeloFile df = new DeloFile();
            doc.getFile().add(df);

            String fileName = esd.getHeader().getName();
            fileName = fileName.substring(0, Math.min(fileName.length(), 100));
            fileName += FilenameUtils.getExtension(fileName).equalsIgnoreCase(esd.getHeader().getExtension())? "":"." + esd.getHeader().getExtension().toLowerCase();

            ri.setUID(String.valueOf(rl.getResource().size()));
            ri.setUniqueName(fileName);
            rl.getResource().add(ri);

            df.setResourceID(Integer.valueOf(ri.getUID()));
            df.setUID(esd.getHeader().getGlobalID().replace("-", "").substring(1, 32));
            df.setSize(esd.getContents().length());
            df.setDescription(esd.getHeader().getName());
            df.setExtension("." + esd.getHeader().getExtension());

            int signNumber = 0;
            for (DigitalSignature ds: esd.getDigitalSignatures().getDigitalSignature()) {
                ri = new ResourceInfo();
                ri.setUID(String.valueOf(rl.getResource().size()));
                ri.setUniqueName(String.format("%s.%s.sig", fileName, signNumber));
                rl.getResource().add(ri);

                EDS eds = new EDS();
                eds.setResourceID(Integer.valueOf(ri.getUID()));
                eds.setCertificate(ds.getCertificateIssuedTo());
                eds.setDate(ds.getSigned());
                eds.setKindID(SignType.valueOf(ds.getSignatureType()).getIndex());
                df.getEDS().add(eds);

                signNumber++;
            }
            doc.getAuthor().add(deloConfig.getDocumentAuthor());


            esd.extractFile(outpuPath);
        }

        header.setResourceList(rl);

        Subscriptions subscriptions = new Subscriptions();
        subscriptions.setStopDayCount(30);

        SubscriptionEvent seTrue = new SubscriptionEvent();
        seTrue.setInclude(true);
        SubscriptionEvent seFalse = new SubscriptionEvent();
        seFalse.setInclude(false);
        SubscriptionEventAdvanceInfo seaFalse = new SubscriptionEventAdvanceInfo();
        seaFalse.setInclude(false);

        subscriptions.setReception(seTrue);
        subscriptions.setRegistration(seTrue);
        subscriptions.setForwarding(seaFalse);
        subscriptions.setConsideration(seaFalse);
        subscriptions.setReport(seTrue);
        subscriptions.setRedirection(seFalse);
        subscriptions.setAnswer(seFalse);
        subscriptions.setVisaDirection(seFalse);
        subscriptions.setSignDirection(seFalse);
        subscriptions.setVisaInformation(seFalse);
        subscriptions.setSignInformation(seFalse);

        result.setSubscriptions(subscriptions);

        try {
            result.saveToXML(outpuPath);
        } catch (JAXBException e) {
            //TODO
            throw new Exception("Ошибка создания DocInfo.xml", e);
        }
    }
}
