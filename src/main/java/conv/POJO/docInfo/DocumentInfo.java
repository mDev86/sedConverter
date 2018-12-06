
package conv.POJO.docInfo;

import conv.Exceptions.CustomWorkExceptions;
import conv.POJO.SigInfo;
import conv.POJO.SignType;
import conv.POJO.esd.*;
import conv.Utils.Config;
import conv.Utils.FileConvert;
import conv.Utils.SigParser;
import org.apache.logging.log4j.LogManager;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;


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

    public void saveToXML(String path) throws JAXBException {
        File file = new File(Paths.get(path, "DocInfo.xml").toString());

        JAXBContext jaxbContext = JAXBContext.newInstance(DocumentInfo.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);

        marshaller.marshal(this, file);
    }

    public List<ESD> toESD(String sourceCatlog) throws CustomWorkExceptions {
        List<ESD> esds = new ArrayList<>();

        String Organization = null;
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
                        try {
                            Organization = Config.getInstance().getOGVuid().get(orgUID);
                        } catch (IOException e) {
                            LogManager.getRootLogger().warn("Ошибка записи или считывания файла с uid огв", e);
                        }
                        if (Organization == null || Organization.isEmpty()) {
                            if(organization.getFullName() != null){
                                Organization = organization.getFullName();
                            }else {
                                Organization = organization.getShortName();
                            }
                        }
                    }
                }
            }
            /**Получение списка файлов**/
            ResourceList resourceList = messageHeader.getResourceList();
            if (resourceList != null && resourceList.getResource() != null) {
                listResource = resourceList.getResource();
            } else {
                throw new CustomWorkExceptions("Ошибка получения сопутствующих файлов(<ResourceList>) в docinfo.xml", null);
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
                                XMLGregorianCalendar date = null;
                                try {
                                    date = registrationInfo.getDate();
                                    date = DatatypeFactory.newInstance().newXMLGregorianCalendar(registrationInfo.getDate().toGregorianCalendar());
                                } catch (DatatypeConfigurationException e) {
                                    LogManager.getRootLogger().warn("Проблема при преобразовании даты в формат XMLGregorianCalendar", e);
                                    if(date.getHour() < 0) date.setHour(0);
                                    if(date.getMinute() < 0) date.setMinute(0);
                                    if(date.getSecond() < 0) date.setSecond(0);
                                    if(date.getMillisecond() < 0) date.setMillisecond(0);
                                    date.setTimezone(ZoneOffset.systemDefault().getRules().getOffset(Instant.now()).getTotalSeconds()/60);
                                    e.printStackTrace();
                                }
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
                        LogManager.getRootLogger().warn("Проблема конвертации docInfo -> esd: Нет описания файлов, отсутствуют теги <File>");
                    }
                }
            } else {
                throw new CustomWorkExceptions("Отсутствует список РК (<DocumentList>).", null);
            }
        }
        return esds;
    }
}
