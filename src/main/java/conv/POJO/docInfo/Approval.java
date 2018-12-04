
package conv.POJO.docInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Approval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Approval">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}UidRequired">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{http://www.eos.ru/2010/sev}Contact"/>
 *         &lt;element name="SignDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MainInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentContact" type="{http://www.eos.ru/2010/sev}Contact" minOccurs="0"/>
 *         &lt;element name="File" type="{http://www.eos.ru/2010/sev}DeloFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Kind" use="required" type="{http://www.eos.ru/2010/sev}ApprovalKind" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Approval", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "contact",
    "signDate",
    "mainInfo",
    "addInfo",
    "parentContact",
    "file"
})
public class Approval
    extends UidRequired
{

    @XmlElement(name = "Contact", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected Contact contact;
    @XmlElement(name = "SignDate", namespace = "http://www.eos.ru/2010/sev")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    @XmlElement(name = "MainInfo", namespace = "http://www.eos.ru/2010/sev")
    protected String mainInfo;
    @XmlElement(name = "AddInfo", namespace = "http://www.eos.ru/2010/sev")
    protected String addInfo;
    @XmlElement(name = "ParentContact", namespace = "http://www.eos.ru/2010/sev")
    protected Contact parentContact;
    @XmlElement(name = "File", namespace = "http://www.eos.ru/2010/sev")
    protected List<DeloFile> file;
    @XmlAttribute(name = "Kind", required = true)
    protected ApprovalKind kind;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the mainInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainInfo() {
        return mainInfo;
    }

    /**
     * Sets the value of the mainInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainInfo(String value) {
        this.mainInfo = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the parentContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getParentContact() {
        return parentContact;
    }

    /**
     * Sets the value of the parentContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setParentContact(Contact value) {
        this.parentContact = value;
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
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalKind }
     *     
     */
    public ApprovalKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalKind }
     *     
     */
    public void setKind(ApprovalKind value) {
        this.kind = value;
    }

}
