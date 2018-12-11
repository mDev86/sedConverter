package conv.Utils;

import conv.Exceptions.CustomWorkExceptions;
import conv.POJO.DeloConfig;
import conv.POJO.SignType;
import conv.POJO.docInfo.*;
import conv.POJO.esd.DigitalSignature;
import conv.POJO.esd.ESD;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Класс-helper для конвертирования списка esd файлов в DocInfo
 */
public class ESDConverter {

    /**
     * Функция определения главного esd'шника из списка
     * @param esds
     * @return
     */
    private static ESD getMain(List<ESD> esds) {
        for (ESD esd: esds) {
            if (!esd.getHeader().getNumber().isEmpty())
                return esd;
        }

        return null;
    }

    /**
     * Функция конвертирования списка esd файлов в DocInfo
     * @param esds лист esd
     * @param outpuPath директория в которую будет сгенерированн файл DocInfo
     * @param returnId идентификатор для матчинга сообщений
     * @param messageId идентификатор для матчинга сообщений
     * @throws CustomWorkExceptions
     */
    public static void convert(List<ESD> esds, String outpuPath, String returnId, String messageId) throws CustomWorkExceptions {
        Logger logger = LogManager.getRootLogger();

        //Корневой элемент XML
        DocumentInfo result = new DocumentInfo();

        //Считывание и десерелизация файла с информацией о отправителе, получателе и авторе (элемнты Sender, Recipient, Author)
        DeloConfig deloConfig = null;
        try {
            deloConfig = Config.getInstance().getDeloCofig();
        } catch (IOException e) {
            logger.error("Ошибка чтения файлов конфигурации", e);
        }
        if (deloConfig == null) {
            throw new CustomWorkExceptions("Ошибка чтения параметров отправителя и получателя");
        }

        //Определяем главный документ
        ESD main = getMain(esds);
        if (main == null) {
            throw new CustomWorkExceptions("Ошибка определения главного документа");
        }

        //Элемент Header
        MessageHeader header = new MessageHeader();
        result.setHeader(header);

        //Устанавливаем атрибуты Header'а
        header.setResourceID(0);
        header.setMessageType(DocumentMessageType.MAIN_DOC);
        header.setVersion("1.0");

        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        gCalendar.setTime(new Date());
        XMLGregorianCalendar xmlgCalendar = null;
        try {
            xmlgCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException e) {
            logger.warn("Ошибка преобразования даты в XMLGregorianCalendar", e);
        }
        header.setTime(xmlgCalendar);

        header.setReturnID(returnId);
        header.setMessageID(messageId);

        header.setSender(deloConfig.getSender());
        header.setRecipient(deloConfig.getRecipient());

        //Элемент Header-ResourceList
        ResourceList rl = new ResourceList();

        //Нулевой элемент сам файл DocInfo.xml
        ResourceInfo riDI = new ResourceInfo();
        riDI.setUID("0");
        riDI.setUniqueName("DocInfo.xml");

        rl.getResource().add(riDI);

        //Элемент DocumentList
        DocumentList dl = new DocumentList();
        result.setDocumentList(dl);

        //Элемнт DocumentList-Document
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

        //Генерация записей и элементов Header-ResourceList, DocumentList-File
        //И сохранение самих файлов и подписей, если они есть
        for (ESD esd: esds) {
            //Элемент Header-ResourceList
            ResourceInfo ri = new ResourceInfo();

            //Элемент DocumentList-File
            DeloFile df = new DeloFile();
            doc.getFile().add(df);

            String fileName = esd.getFileName();

            ri.setUID(String.valueOf(rl.getResource().size()));
            ri.setUniqueName(fileName);
            rl.getResource().add(ri);

            df.setResourceID(Integer.valueOf(ri.getUID()));
            df.setUID(esd.getHeader().getGlobalID().replace("-", "").substring(1, 32));
            df.setSize(esd.getContents().length());
            df.setDescription(esd.getHeader().getName());
            df.setExtension("." + esd.getHeader().getExtension());

            //Если esd содержит подписи добавляем их в Header-ResourceList и DocumentList-File в элемент EDS
            int signNumber = 0;
            for (DigitalSignature ds: esd.getDigitalSignatures().getDigitalSignature()) {
                //Header-ResourceList
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

            //Извлекаем файл и подписи, если они есть
            esd.extractFile(outpuPath);
        }

        header.setResourceList(rl);

        //Формируем элемнт Subscriptions
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

        //Сохраняем Docinfo в outpuPath
        try {
            result.saveToXML(outpuPath);
        } catch (JAXBException e) {
            throw new CustomWorkExceptions("Ошибка создания DocInfo.xml", e);
        }
    }
}
