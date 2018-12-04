
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentAuthor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentAuthor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{http://www.eos.ru/2010/sev}Contact" minOccurs="0"/>
 *         &lt;element name="RegistrationInfo" type="{http://www.eos.ru/2010/sev}RegistrationInfo" minOccurs="0"/>
 *         &lt;element name="PrivatePerson" type="{http://www.eos.ru/2010/sev}PrivatePerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAuthor", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "contact",
    "registrationInfo",
    "privatePerson"
})
public class DocumentAuthor
    extends BaseComplexType
{

    @XmlElement(name = "Contact", namespace = "http://www.eos.ru/2010/sev")
    protected Contact contact;
    @XmlElement(name = "RegistrationInfo", namespace = "http://www.eos.ru/2010/sev")
    protected RegistrationInfo registrationInfo;
    @XmlElement(name = "PrivatePerson", namespace = "http://www.eos.ru/2010/sev")
    protected PrivatePerson privatePerson;

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
     * Gets the value of the privatePerson property.
     * 
     * @return
     *     possible object is
     *     {@link PrivatePerson }
     *     
     */
    public PrivatePerson getPrivatePerson() {
        return privatePerson;
    }

    /**
     * Sets the value of the privatePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivatePerson }
     *     
     */
    public void setPrivatePerson(PrivatePerson value) {
        this.privatePerson = value;
    }

}
