
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscriptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscriptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="Reception" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Registration" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Forwarding" type="{http://www.eos.ru/2010/sev}SubscriptionEventAdvanceInfo"/>
 *         &lt;element name="Consideration" type="{http://www.eos.ru/2010/sev}SubscriptionEventAdvanceInfo"/>
 *         &lt;element name="TaskDecoration" type="{http://www.eos.ru/2010/sev}TaskDecoration" minOccurs="0"/>
 *         &lt;element name="Report" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Redirection" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Answer" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="VisaDirection" type="{http://www.eos.ru/2010/sev}SubscriptionEvent" minOccurs="0"/>
 *         &lt;element name="SignDirection" type="{http://www.eos.ru/2010/sev}SubscriptionEvent" minOccurs="0"/>
 *         &lt;element name="VisaInformation" type="{http://www.eos.ru/2010/sev}SubscriptionEvent" minOccurs="0"/>
 *         &lt;element name="SignInformation" type="{http://www.eos.ru/2010/sev}SubscriptionEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StopDayCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriptions", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "reception",
    "registration",
    "forwarding",
    "consideration",
    "taskDecoration",
    "report",
    "redirection",
    "answer",
    "visaDirection",
    "signDirection",
    "visaInformation",
    "signInformation"
})
public class Subscriptions
    extends BaseComplexType
{

    @XmlElement(name = "Reception", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent reception;
    @XmlElement(name = "Registration", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent registration;
    @XmlElement(name = "Forwarding", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEventAdvanceInfo forwarding;
    @XmlElement(name = "Consideration", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEventAdvanceInfo consideration;
    @XmlElement(name = "TaskDecoration", namespace = "http://www.eos.ru/2010/sev")
    protected TaskDecoration taskDecoration;
    @XmlElement(name = "Report", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent report;
    @XmlElement(name = "Redirection", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent redirection;
    @XmlElement(name = "Answer", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent answer;
    @XmlElement(name = "VisaDirection", namespace = "http://www.eos.ru/2010/sev")
    protected SubscriptionEvent visaDirection;
    @XmlElement(name = "SignDirection", namespace = "http://www.eos.ru/2010/sev")
    protected SubscriptionEvent signDirection;
    @XmlElement(name = "VisaInformation", namespace = "http://www.eos.ru/2010/sev")
    protected SubscriptionEvent visaInformation;
    @XmlElement(name = "SignInformation", namespace = "http://www.eos.ru/2010/sev")
    protected SubscriptionEvent signInformation;
    @XmlAttribute(name = "StopDayCount", required = true)
    protected int stopDayCount;

    /**
     * Gets the value of the reception property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getReception() {
        return reception;
    }

    /**
     * Sets the value of the reception property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setReception(SubscriptionEvent value) {
        this.reception = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setRegistration(SubscriptionEvent value) {
        this.registration = value;
    }

    /**
     * Gets the value of the forwarding property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEventAdvanceInfo }
     *     
     */
    public SubscriptionEventAdvanceInfo getForwarding() {
        return forwarding;
    }

    /**
     * Sets the value of the forwarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEventAdvanceInfo }
     *     
     */
    public void setForwarding(SubscriptionEventAdvanceInfo value) {
        this.forwarding = value;
    }

    /**
     * Gets the value of the consideration property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEventAdvanceInfo }
     *     
     */
    public SubscriptionEventAdvanceInfo getConsideration() {
        return consideration;
    }

    /**
     * Sets the value of the consideration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEventAdvanceInfo }
     *     
     */
    public void setConsideration(SubscriptionEventAdvanceInfo value) {
        this.consideration = value;
    }

    /**
     * Gets the value of the taskDecoration property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDecoration }
     *     
     */
    public TaskDecoration getTaskDecoration() {
        return taskDecoration;
    }

    /**
     * Sets the value of the taskDecoration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDecoration }
     *     
     */
    public void setTaskDecoration(TaskDecoration value) {
        this.taskDecoration = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setReport(SubscriptionEvent value) {
        this.report = value;
    }

    /**
     * Gets the value of the redirection property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getRedirection() {
        return redirection;
    }

    /**
     * Sets the value of the redirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setRedirection(SubscriptionEvent value) {
        this.redirection = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setAnswer(SubscriptionEvent value) {
        this.answer = value;
    }

    /**
     * Gets the value of the visaDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getVisaDirection() {
        return visaDirection;
    }

    /**
     * Sets the value of the visaDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setVisaDirection(SubscriptionEvent value) {
        this.visaDirection = value;
    }

    /**
     * Gets the value of the signDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getSignDirection() {
        return signDirection;
    }

    /**
     * Sets the value of the signDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setSignDirection(SubscriptionEvent value) {
        this.signDirection = value;
    }

    /**
     * Gets the value of the visaInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getVisaInformation() {
        return visaInformation;
    }

    /**
     * Sets the value of the visaInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setVisaInformation(SubscriptionEvent value) {
        this.visaInformation = value;
    }

    /**
     * Gets the value of the signInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getSignInformation() {
        return signInformation;
    }

    /**
     * Sets the value of the signInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setSignInformation(SubscriptionEvent value) {
        this.signInformation = value;
    }

    /**
     * Gets the value of the stopDayCount property.
     * 
     */
    public int getStopDayCount() {
        return stopDayCount;
    }

    /**
     * Sets the value of the stopDayCount property.
     * 
     */
    public void setStopDayCount(int value) {
        this.stopDayCount = value;
    }

}
