
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionEventAdvanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionEventAdvanceInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}SubscriptionEvent">
 *       &lt;attribute name="AdvanceInfo" type="{http://www.eos.ru/2010/sev}AdvanceInfoType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionEventAdvanceInfo", namespace = "http://www.eos.ru/2010/sev")
public class SubscriptionEventAdvanceInfo
    extends SubscriptionEvent
{

    @XmlAttribute(name = "AdvanceInfo")
    protected AdvanceInfoType advanceInfo;

    /**
     * Gets the value of the advanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceInfoType }
     *     
     */
    public AdvanceInfoType getAdvanceInfo() {
        return advanceInfo;
    }

    /**
     * Sets the value of the advanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceInfoType }
     *     
     */
    public void setAdvanceInfo(AdvanceInfoType value) {
        this.advanceInfo = value;
    }

}
