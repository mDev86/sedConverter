
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleContentUidRequired complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleContentUidRequired">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.eos.ru/2010/sev>BaseSimpleContentStringComplexType">
 *       &lt;attribute name="UID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleContentUidRequired", namespace = "http://www.eos.ru/2010/sev")
@XmlSeeAlso({
    EDMS.class
})
public abstract class SimpleContentUidRequired
    extends BaseSimpleContentStringComplexType
{

    @XmlAttribute(name = "UID", required = true)
    protected String uid;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

}
