
package conv.POJO.docInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivatePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivatePerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}UidOptional">
 *       &lt;sequence>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sex" type="{http://www.eos.ru/2010/sev}Sex" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passport" type="{http://www.eos.ru/2010/sev}Passport" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.eos.ru/2010/sev}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Econtact" type="{http://www.eos.ru/2010/sev}Econtact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SNILS" type="{http://www.eos.ru/2010/sev}String14Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivatePerson", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "fio",
    "sex",
    "inn",
    "passport",
    "address",
    "econtact",
    "snils"
})
public class PrivatePerson
    extends UidOptional
{

    @XmlElement(name = "FIO", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected String fio;
    @XmlElement(name = "Sex", namespace = "http://www.eos.ru/2010/sev")
    @XmlSchemaType(name = "string")
    protected Sex sex;
    @XmlElement(name = "INN", namespace = "http://www.eos.ru/2010/sev")
    protected String inn;
    @XmlElement(name = "Passport", namespace = "http://www.eos.ru/2010/sev")
    protected Passport passport;
    @XmlElement(name = "Address", namespace = "http://www.eos.ru/2010/sev")
    protected List<Address> address;
    @XmlElement(name = "Econtact", namespace = "http://www.eos.ru/2010/sev")
    protected List<Econtact> econtact;
    @XmlElement(name = "SNILS", namespace = "http://www.eos.ru/2010/sev")
    protected String snils;

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link Sex }
     *     
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sex }
     *     
     */
    public void setSex(Sex value) {
        this.sex = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link Passport }
     *     
     */
    public Passport getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passport }
     *     
     */
    public void setPassport(Passport value) {
        this.passport = value;
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

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

}
