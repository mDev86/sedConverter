
package conv.POJO.docInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficialPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficialPerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}UidOptional">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="Post" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="Post" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficialPerson", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "rest"
})
public class OfficialPerson
    extends UidOptional
{

    @XmlElementRefs({
        @XmlElementRef(name = "Index", namespace = "http://www.eos.ru/2010/sev", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FIO", namespace = "http://www.eos.ru/2010/sev", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Post", namespace = "http://www.eos.ru/2010/sev", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Post" is used by two different parts of a schema. See: 
     * line 470 of file:/C:/Users/SlobodenukSS/Documents/Projects/convert/src/main/resources/CommonInfo.xsd
     * line 467 of file:/C:/Users/SlobodenukSS/Documents/Projects/convert/src/main/resources/CommonInfo.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<String>>();
        }
        return this.rest;
    }

}
