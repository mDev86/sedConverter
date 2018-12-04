
package conv.POJO.docInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="Organization" type="{http://www.eos.ru/2010/sev}Organization"/>
 *         &lt;element name="Department" type="{http://www.eos.ru/2010/sev}Department" minOccurs="0"/>
 *         &lt;element name="OfficialPerson" type="{http://www.eos.ru/2010/sev}OfficialPerson" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.eos.ru/2010/sev}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Econtact" type="{http://www.eos.ru/2010/sev}Econtact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "organization",
    "department",
    "officialPerson",
    "address",
    "econtact"
})
public class Contact
    extends BaseComplexType
{

    @XmlElement(name = "Organization", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected Organization organization;
    @XmlElement(name = "Department", namespace = "http://www.eos.ru/2010/sev")
    protected Department department;
    @XmlElement(name = "OfficialPerson", namespace = "http://www.eos.ru/2010/sev")
    protected OfficialPerson officialPerson;
    @XmlElement(name = "Address", namespace = "http://www.eos.ru/2010/sev")
    protected List<Address> address;
    @XmlElement(name = "Econtact", namespace = "http://www.eos.ru/2010/sev")
    protected List<Econtact> econtact;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    /**
     * Gets the value of the officialPerson property.
     * 
     * @return
     *     possible object is
     *     {@link OfficialPerson }
     *     
     */
    public OfficialPerson getOfficialPerson() {
        return officialPerson;
    }

    /**
     * Sets the value of the officialPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficialPerson }
     *     
     */
    public void setOfficialPerson(OfficialPerson value) {
        this.officialPerson = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the econtact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the econtact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcontact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Econtact }
     * 
     * 
     */
    public List<Econtact> getEcontact() {
        if (econtact == null) {
            econtact = new ArrayList<Econtact>();
        }
        return this.econtact;
    }

}
