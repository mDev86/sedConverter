
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Visa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visa">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{http://www.eos.ru/2010/sev}Contact"/>
 *         &lt;element name="SignDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VisaInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visa", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "contact",
    "signDate",
    "visaInfo"
})
public class Visa
    extends BaseComplexType
{

    @XmlElement(name = "Contact", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected Contact contact;
    @XmlElement(name = "SignDate", namespace = "http://www.eos.ru/2010/sev")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signDate;
    @XmlElement(name = "VisaInfo", namespace = "http://www.eos.ru/2010/sev")
    protected String visaInfo;

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
     * Gets the value of the visaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaInfo() {
        return visaInfo;
    }

    /**
     * Sets the value of the visaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaInfo(String value) {
        this.visaInfo = value;
    }

}
