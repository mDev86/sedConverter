
package conv.POJO.docInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}UidOptional">
 *       &lt;sequence>
 *         &lt;element name="RegistrationInfo" type="{http://www.eos.ru/2010/sev}RegistrationInfo"/>
 *         &lt;element name="Control" type="{http://www.eos.ru/2010/sev}DocumentControl" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.eos.ru/2010/sev}Group" minOccurs="0"/>
 *         &lt;element name="Access" type="{http://www.eos.ru/2010/sev}Access" minOccurs="0"/>
 *         &lt;element name="Consists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Collective" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Rubric" type="{http://www.eos.ru/2010/sev}Rubric" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="File" type="{http://www.eos.ru/2010/sev}DeloFile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.eos.ru/2010/sev}DocumentAuthor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Visa" type="{http://www.eos.ru/2010/sev}Visa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Approval" type="{http://www.eos.ru/2010/sev}Approval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Addressee" type="{http://www.eos.ru/2010/sev}Addressee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Writer" type="{http://www.eos.ru/2010/sev}Writer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalField" type="{http://www.eos.ru/2010/sev}AdditionalField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Link" type="{http://www.eos.ru/2010/sev}Link" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DocumentID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" use="required" type="{http://www.eos.ru/2010/sev}DocumentType" />
 *       &lt;attribute name="MainDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Status" type="{http://www.eos.ru/2010/sev}Status" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="VersionUID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "registrationInfo",
    "control",
    "group",
    "access",
    "consists",
    "annotation",
    "note",
    "collective",
    "rubric",
    "file",
    "author",
    "visa",
    "approval",
    "addressee",
    "writer",
    "additionalField",
    "link"
})
public class Document
    extends UidOptional
{

    @XmlElement(name = "RegistrationInfo", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected RegistrationInfo registrationInfo;
    @XmlElement(name = "Control", namespace = "http://www.eos.ru/2010/sev")
    protected DocumentControl control;
    @XmlElement(name = "Group", namespace = "http://www.eos.ru/2010/sev")
    protected Group group;
    @XmlElement(name = "Access", namespace = "http://www.eos.ru/2010/sev")
    protected Access access;
    @XmlElement(name = "Consists", namespace = "http://www.eos.ru/2010/sev")
    protected String consists;
    @XmlElement(name = "Annotation", namespace = "http://www.eos.ru/2010/sev")
    protected String annotation;
    @XmlElement(name = "Note", namespace = "http://www.eos.ru/2010/sev")
    protected String note;
    @XmlElement(name = "Collective", namespace = "http://www.eos.ru/2010/sev")
    protected Boolean collective;
    @XmlElement(name = "Rubric", namespace = "http://www.eos.ru/2010/sev")
    protected List<Rubric> rubric;
    @XmlElement(name = "File", namespace = "http://www.eos.ru/2010/sev")
    protected List<DeloFile> file;
    @XmlElement(name = "Author", namespace = "http://www.eos.ru/2010/sev")
    protected List<DocumentAuthor> author;
    @XmlElement(name = "Visa", namespace = "http://www.eos.ru/2010/sev")
    protected List<Visa> visa;
    @XmlElement(name = "Approval", namespace = "http://www.eos.ru/2010/sev")
    protected List<Approval> approval;
    @XmlElement(name = "Addressee", namespace = "http://www.eos.ru/2010/sev")
    protected List<Addressee> addressee;
    @XmlElement(name = "Writer", namespace = "http://www.eos.ru/2010/sev")
    protected List<Writer> writer;
    @XmlElement(name = "AdditionalField", namespace = "http://www.eos.ru/2010/sev")
    protected List<AdditionalField> additionalField;
    @XmlElement(name = "Link", namespace = "http://www.eos.ru/2010/sev")
    protected List<Link> link;
    @XmlAttribute(name = "DocumentID", required = true)
    protected String documentID;
    @XmlAttribute(name = "Type", required = true)
    protected DocumentType type;
    @XmlAttribute(name = "MainDocument", required = true)
    protected boolean mainDocument;
    @XmlAttribute(name = "Status")
    protected Status status;
    @XmlAttribute(name = "Version")
    protected Integer version;
    @XmlAttribute(name = "VersionUID")
    protected String versionUID;

    /**
     * Gets the value of the registrationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationInfo }
     *     
     */
    public RegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    /**
     * Sets the value of the registrationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationInfo }
     *     
     */
    public void setRegistrationInfo(RegistrationInfo value) {
        this.registrationInfo = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentControl }
     *     
     */
    public DocumentControl getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentControl }
     *     
     */
    public void setControl(DocumentControl value) {
        this.control = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link Access }
     *     
     */
    public Access getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link Access }
     *     
     */
    public void setAccess(Access value) {
        this.access = value;
    }

    /**
     * Gets the value of the consists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsists() {
        return consists;
    }

    /**
     * Sets the value of the consists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsists(String value) {
        this.consists = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the collective property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollective() {
        return collective;
    }

    /**
     * Sets the value of the collective property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollective(Boolean value) {
        this.collective = value;
    }

    /**
     * Gets the value of the rubric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rubric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRubric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rubric }
     * 
     * 
     */
    public List<Rubric> getRubric() {
        if (rubric == null) {
            rubric = new ArrayList<Rubric>();
        }
        return this.rubric;
    }

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeloFile }
     * 
     * 
     */
    public List<DeloFile> getFile() {
        if (file == null) {
            file = new ArrayList<DeloFile>();
        }
        return this.file;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAuthor }
     * 
     * 
     */
    public List<DocumentAuthor> getAuthor() {
        if (author == null) {
            author = new ArrayList<DocumentAuthor>();
        }
        return this.author;
    }

    /**
     * Gets the value of the visa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Visa }
     * 
     * 
     */
    public List<Visa> getVisa() {
        if (visa == null) {
            visa = new ArrayList<Visa>();
        }
        return this.visa;
    }

    /**
     * Gets the value of the approval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Approval }
     * 
     * 
     */
    public List<Approval> getApproval() {
        if (approval == null) {
            approval = new ArrayList<Approval>();
        }
        return this.approval;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addressee }
     * 
     * 
     */
    public List<Addressee> getAddressee() {
        if (addressee == null) {
            addressee = new ArrayList<Addressee>();
        }
        return this.addressee;
    }

    /**
     * Gets the value of the writer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWriter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Writer }
     * 
     * 
     */
    public List<Writer> getWriter() {
        if (writer == null) {
            writer = new ArrayList<Writer>();
        }
        return this.writer;
    }

    /**
     * Gets the value of the additionalField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalField }
     * 
     * 
     */
    public List<AdditionalField> getAdditionalField() {
        if (additionalField == null) {
            additionalField = new ArrayList<AdditionalField>();
        }
        return this.additionalField;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link }
     * 
     * 
     */
    public List<Link> getLink() {
        if (link == null) {
            link = new ArrayList<Link>();
        }
        return this.link;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setType(DocumentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the mainDocument property.
     * 
     */
    public boolean isMainDocument() {
        return mainDocument;
    }

    /**
     * Sets the value of the mainDocument property.
     * 
     */
    public void setMainDocument(boolean value) {
        this.mainDocument = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionUID() {
        return versionUID;
    }

    /**
     * Sets the value of the versionUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionUID(String value) {
        this.versionUID = value;
    }

}
