
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleContentUidOptional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleContentUidOptional">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.eos.ru/2010/sev>BaseSimpleContentStringComplexType">
 *       &lt;attribute name="UID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleContentUidOptional", namespace = "http://www.eos.ru/2010/sev")
@XmlSeeAlso({
    Access.class,
    ExecutionStatus.class,
    Region.class,
    Rubric.class,
    Group.class,
    Category.class,
    LinkType.class
})
public abstract class SimpleContentUidOptional
    extends BaseSimpleContentStringComplexType
{

    @XmlAttribute(name = "UID")
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
