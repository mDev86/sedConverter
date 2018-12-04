
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sender">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{http://www.eos.ru/2010/sev}Contact"/>
 *         &lt;element name="EDMS" type="{http://www.eos.ru/2010/sev}EDMS"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sender", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "contact",
    "edms"
})
public class Sender
    extends BaseComplexType
{

    @XmlElement(name = "Contact", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected Contact contact;
    @XmlElement(name = "EDMS", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected EDMS edms;

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
     * Gets the value of the edms property.
     * 
     * @return
     *     possible object is
     *     {@link EDMS }
     *     
     */
    public EDMS getEDMS() {
        return edms;
    }

    /**
     * Sets the value of the edms property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDMS }
     *     
     */
    public void setEDMS(EDMS value) {
        this.edms = value;
    }

}
