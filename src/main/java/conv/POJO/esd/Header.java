//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.28 at 12:23:34 PM GMT+05:00 
//


package conv.POJO.esd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Author" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CreatedInSenderSystem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Extension" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="GlobalID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Modified" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Note" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Organization" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SourceEDocumentID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SourceEDocumentVersionNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Header")
public class Header {

    @XmlAttribute(name = "Author", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String author;
    @XmlAttribute(name = "CreatedInSenderSystem", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String createdInSenderSystem;
    @XmlAttribute(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "Extension", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String extension;
    @XmlAttribute(name = "GlobalID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String globalID;
    @XmlAttribute(name = "Modified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    @XmlAttribute(name = "Name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "Note", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String note;
    @XmlAttribute(name = "Number", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String number;
    @XmlAttribute(name = "Organization", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String organization;
    @XmlAttribute(name = "SourceEDocumentID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceEDocumentID;
    @XmlAttribute(name = "SourceEDocumentVersionNumber", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceEDocumentVersionNumber;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the createdInSenderSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedInSenderSystem() {
        return createdInSenderSystem;
    }

    /**
     * Sets the value of the createdInSenderSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedInSenderSystem(String value) {
        this.createdInSenderSystem = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the globalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalID() {
        return globalID;
    }

    /**
     * Sets the value of the globalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalID(String value) {
        this.globalID = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the sourceEDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceEDocumentID() {
        return sourceEDocumentID;
    }

    /**
     * Sets the value of the sourceEDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceEDocumentID(String value) {
        this.sourceEDocumentID = value;
    }

    /**
     * Gets the value of the sourceEDocumentVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceEDocumentVersionNumber() {
        return sourceEDocumentVersionNumber;
    }

    /**
     * Sets the value of the sourceEDocumentVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceEDocumentVersionNumber(String value) {
        this.sourceEDocumentVersionNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
