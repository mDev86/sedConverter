
package conv.POJO.docInfo;

import conv.POJO.SigInfo;
import conv.POJO.SignType;
import conv.POJO.esd.*;
import conv.Utils.Config;
import conv.Utils.FileConvert;
import conv.Utils.SigParser;
import jdk.nashorn.internal.objects.Global;
import org.apache.commons.io.FilenameUtils;
import org.bouncycastle.cms.CMSException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.*;


/**
 * <p>Java class for DocumentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.eos.ru/2010/sev}MessageHeader"/>
 *         &lt;element name="DocumentList" type="{http://www.eos.ru/2010/sev}DocumentList"/>
 *         &lt;element name="TaskList" type="{http://www.eos.ru/2010/sev}TaskList" minOccurs="0"/>
 *         &lt;element name="Subscriptions" type="{http://www.eos.ru/2010/sev}Subscriptions" minOccurs="0"/>
 *         &lt;element name="Expansion" type="{http://www.eos.ru/2010/sev}Expansion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfo", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "header",
    "documentList",
    "taskList",
    "subscriptions",
    "expansion"
})

@XmlRootElement(name = "DocInfo", namespace = "http://www.eos.ru/2010/sev")
public class DocumentInfo
    extends BaseComplexType
{

    @XmlElement(name = "Header", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected MessageHeader header;
    @XmlElement(name = "DocumentList", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected DocumentList documentList;
    @XmlElement(name = "TaskList", namespace = "http://www.eos.ru/2010/sev")
    protected TaskList taskList;
    @XmlElement(name = "Subscriptions", namespace = "http://www.eos.ru/2010/sev")
    protected Subscriptions subscriptions;
    @XmlElement(name = "Expansion", namespace = "http://www.eos.ru/2010/sev")
    protected Expansion expansion;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setHeader(MessageHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the documentList property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentList }
     *     
     */
    public DocumentList getDocumentList() {
        return documentList;
    }

    /**
     * Sets the value of the documentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentList }
     *     
     */
    public void setDocumentList(DocumentList value) {
        this.documentList = value;
    }

    /**
     * Gets the value of the taskList property.
     * 
     * @return
     *     possible object is
     *     {@link TaskList }
     *     
     */
    public TaskList getTaskList() {
        return taskList;
    }

    /**
     * Sets the value of the taskList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskList }
     *     
     */
    public void setTaskList(TaskList value) {
        this.taskList = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Subscriptions }
     *     
     */
    public Subscriptions getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriptions }
     *     
     */
    public void setSubscriptions(Subscriptions value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the expansion property.
     * 
     * @return
     *     possible object is
     *     {@link Expansion }
     *     
     */
    public Expansion getExpansion() {
        return expansion;
    }

    /**
     * Sets the value of the expansion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expansion }
     *     
     */
    public void setExpansion(Expansion value) {
        this.expansion = value;
    }


    private static Sender getDISender() {
        Sender s = new Sender();

        Contact contact = new Contact();
        Econtact ec = new Econtact();
        ec.setType("e");
        ec.setValue("office@uriit.ru");
        contact.getEcontact().add(ec);

        s.setContact(contact);

        Organization organization = new Organization();
        organization.setUID("0801");
        organization.setShortName("АУ ХМАО - Югры \"Югорский научно-исследовательский институт информационных технологий\" (ЮНИИИТ)");

        contact.setOrganization(organization);

        EDMS edms = new EDMS();
        edms.setVersion("5.0.0.1016");
        edms.setUID("0dfffc0f6c4b4f923a8725e63cee4cb1");
        edms.setValue("DIRECTUM");

        s.setEDMS(edms);

        return s;
    }


    private static Recipient getDIRecipient() {
        Recipient r = new Recipient();

        Contact contact = new Contact();
        Econtact ec = new Econtact();
        ec.setType("e");
        ec.setValue("depit@admhmao.ru");
        contact.getEcontact().add(ec);

        Organization organization = new Organization();
        organization.setUID("08");
        organization.setShortName("Департамент информационных технологий Ханты-Мансийского автономного округа - Югры");

        contact.setOrganization(organization);

        r.getContact().add(contact);
        return r;
    }

    public void saveToXML(String path) throws JAXBException {
        File file = new File(Paths.get(path, "DocInfo.xml").toString());

        JAXBContext jaxbContext = JAXBContext.newInstance(DocumentInfo.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(this, file);
    }

    public static void convert(ESD main, List<ESD> esds, String outpuPath) throws Exception {
        DocumentInfo result = new DocumentInfo();

        MessageHeader header = new MessageHeader();
        result.setHeader(header);

        header.setResourceID(0);
        header.setMessageType(DocumentMessageType.MAIN_DOC);
        header.setVersion("1.0");

        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        gCalendar.setTime(new Date());
        header.setTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar));

        //TODO: получать returnID, messageID
        header.setReturnID(UUID.randomUUID().toString().replace("-", ""));
        header.setMessageID(UUID.randomUUID().toString().replace("-", ""));

        header.setSender(DocumentInfo.getDISender());
        header.setRecipient(DocumentInfo.getDIRecipient());

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
                //TODO

                eds.setKindID(0);
                df.getEDS().add(eds);

                signNumber++;
            }

            esd.extractFile(outpuPath);
        }

        header.setResourceList(rl);


        try {
            result.saveToXML(outpuPath);
        } catch (JAXBException e) {
            //TODO
            throw new Exception("Ошибка создания DocInfo.xml", e);
        }
    }

    public List<ESD> toESD(String sourceCatlog) throws IOException, CMSException, ParseException, DatatypeConfigurationException {
        List<ESD> esds = new ArrayList<>();

        String Organization = "";
        List<ResourceInfo> listResource = null;

        MessageHeader messageHeader = this.getHeader();
        if (messageHeader != null) {
            /**Получение организации**/
            Sender sender = messageHeader.getSender();
            if (sender != null) {
                Contact contact = sender.getContact();
                if (contact != null) {
                    Organization organization = contact.getOrganization();
                    if (organization != null) {
                        String orgUID = organization.getUID();
                        Organization = Config.getInstance().getOGVuid().get(orgUID);
                        System.out.println(Organization);
                        if (Organization == null) {
                            Organization = organization.shortName;
                        }
                    }
                }
            }
            /**Получение списка файлов**/
            ResourceList resourceList = messageHeader.getResourceList();
            if (resourceList != null && resourceList.getResource() != null) {
                listResource = resourceList.getResource();
            } else {
                //TODO:Прекращаем работу с ошибкой, отсутствуют файлы
            }

        }


        DocumentList docList = this.getDocumentList();
        if (docList != null) {
            List<Document> documents = docList.getDocument();
            if (documents != null) {
                for (Document doc : documents) {

                    List<DeloFile> files = doc.getFile();
                    if (files != null) {
                        for (DeloFile file : files) {
                            ESD esd = new ESD();
                            esd.setVersion(BigDecimal.valueOf(2.0));


                            /**Заполнение ESD.Header **/
                            Header header = new Header();
                            header.setType("Document");
                            header.setName(file.getDescription());
                            header.setExtension(file.getExtension());
                            header.setOrganization(Organization);

                            RegistrationInfo registrationInfo = doc.getRegistrationInfo();
                            if (registrationInfo != null) {
                                //Приведение к нормализованному виду
                                XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(registrationInfo.getDate().toGregorianCalendar());
                                header.setNumber(registrationInfo.getNumber());
                                header.setDate(date);
                                header.setModified(date);
                            }
                            header.setGlobalID(doc.getUID());
                            esd.setHeader(header);

                            /**Заполнение ESD.ExtAttributes **/
                            ID id = new ID();
                            id.setName("ID");
                            id.setType("Integer");
                            id.setIsNull(!doc.getUID().isEmpty());
                            id.setValue(doc.getUID());

                            conv.POJO.esd.Organization org = new conv.POJO.esd.Organization();
                            org.setName("Organization");
                            org.setType("Reference");
                            org.setIsNull(true);
                            org.setReference("Организация");

                            VersionNumber vnumb = new VersionNumber();
                            vnumb.setName("VersionNumber");
                            vnumb.setType("Integer");
                            vnumb.setIsNull(false);
                            vnumb.setValue(BigInteger.ONE);

                            ExtAttributes attributes = new ExtAttributes();
                            attributes.setID(id);
                            attributes.setOrganization(org);
                            attributes.setVersionNumber(vnumb);
                            esd.setExtAttributes(attributes);


                            /**Записываем сам файл**/
                            int fileResourceID = file.getResourceID();
                            ResourceInfo fileInfo = listResource.stream()
                                    .filter(it -> Integer.parseInt(it.getUID()) == fileResourceID)
                                    .findFirst()
                                    .orElse(null);
                            if (fileInfo != null) {
                                esd.setContents(
                                        FileConvert.FileToBase64(new File(sourceCatlog, fileInfo.getUniqueName()))
                                );
                            }


                            /**Заполнение ЭП**/
                            List<EDS> edss = file.getEDS();
                            if (edss != null) {
                                DigitalSignatures digitalSignatures = new DigitalSignatures();
                                for (EDS eds : edss) {
                                    int edsResourceID = eds.getResourceID();
                                    ResourceInfo edsInfo = listResource.stream()
                                            .filter(it -> Integer.parseInt(it.getUID()) == edsResourceID)
                                            .findFirst()
                                            .orElse(null);
                                    if (edsInfo != null) {
                                        DigitalSignature ds = new DigitalSignature();
                                        File thisFile = new File(sourceCatlog, edsInfo.getUniqueName());
                                        SigInfo sigInfo = new SigParser(thisFile).parse();

                                        ds.setCertificateIssuedTo(sigInfo.getConcatSubject());
                                        ds.setCryptoProvider("CryptoPro Encryption");
                                        ds.setSignatureType(SignType.getName(eds.getKindID()));

                                        ds.setData(FileConvert.FileToBase64(thisFile));
                                        ds.setSigned(sigInfo.getSignedToXMLGregorianCalendar());

                                        /**Устанавливаем атрибуты подписи**/
                                        Attributes attrs = new Attributes();
                                        Comment comment = new Comment();
                                        comment.setName("Comment");
                                        comment.setType("String");
                                        comment.setIsNull(false);


                                        comment.setValue(SignType.getName(eds.getKindID()));
                                        attrs.setComment(comment);

                                        SignedByUserName signedUser = new SignedByUserName();
                                        signedUser.setName("SignedByUserName");
                                        signedUser.setType("String");
                                        signedUser.setIsNull(false);
                                        signedUser.setValue(sigInfo.getEmail());
                                        attrs.setSignedByUserName(signedUser);

                                        InTheNameOfUserName nameUser = new InTheNameOfUserName();
                                        nameUser.setName("InTheNameOfUserName");
                                        nameUser.setType("String");
                                        nameUser.setIsNull(false);
                                        nameUser.setValue(sigInfo.getEmail());
                                        attrs.setInTheNameOfUserName(nameUser);
                                        ds.setAttributes(attrs);

                                        digitalSignatures.getDigitalSignature().add(ds);
                                    }
                                }
                                esd.setDigitalSignatures(digitalSignatures);
                            }

                            esds.add(esd);
                        }
                    } else {
                        //INFO: НЕТ СПИСКА ФАЙЛОВ
                    }
                }
            } else {
                //INFO: НЕТ ДОКУМЕНТОВ
            }
        }
        return esds;
    }
}
