
package conv.POJO.docInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recipient">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{http://www.eos.ru/2010/sev}Contact" maxOccurs="unbounded"/>
 *         &lt;element name="EDMS" type="{http://www.eos.ru/2010/sev}EDMS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "contact",
    "edms"
})
public class Recipient
    extends BaseComplexType
{

    @XmlElement(name = "Contact", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected List<Contact> contact;
    @XmlElement(name = "EDMS", namespace = "http://www.eos.ru/2010/sev")
    protected EDMS edms;

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
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
