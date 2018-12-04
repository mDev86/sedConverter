
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskDecoration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskDecoration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Category" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Note" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="ControlState" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="PlanDate" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Controller" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Summary" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="FactDate" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Status" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Resume" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *         &lt;element name="Executor" type="{http://www.eos.ru/2010/sev}SubscriptionEventAdvanceInfo"/>
 *         &lt;element name="ExecutorReport" type="{http://www.eos.ru/2010/sev}SubscriptionEvent"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskDecoration", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "text",
    "category",
    "note",
    "controlState",
    "planDate",
    "controller",
    "summary",
    "factDate",
    "status",
    "resume",
    "executor",
    "executorReport"
})
public class TaskDecoration
    extends BaseComplexType
{

    @XmlElement(name = "Text", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent text;
    @XmlElement(name = "Category", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent category;
    @XmlElement(name = "Note", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent note;
    @XmlElement(name = "ControlState", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent controlState;
    @XmlElement(name = "PlanDate", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent planDate;
    @XmlElement(name = "Controller", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent controller;
    @XmlElement(name = "Summary", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent summary;
    @XmlElement(name = "FactDate", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent factDate;
    @XmlElement(name = "Status", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent status;
    @XmlElement(name = "Resume", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent resume;
    @XmlElement(name = "Executor", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEventAdvanceInfo executor;
    @XmlElement(name = "ExecutorReport", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected SubscriptionEvent executorReport;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setText(SubscriptionEvent value) {
        this.text = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setCategory(SubscriptionEvent value) {
        this.category = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setNote(SubscriptionEvent value) {
        this.note = value;
    }

    /**
     * Gets the value of the controlState property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getControlState() {
        return controlState;
    }

    /**
     * Sets the value of the controlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setControlState(SubscriptionEvent value) {
        this.controlState = value;
    }

    /**
     * Gets the value of the planDate property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getPlanDate() {
        return planDate;
    }

    /**
     * Sets the value of the planDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setPlanDate(SubscriptionEvent value) {
        this.planDate = value;
    }

    /**
     * Gets the value of the controller property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getController() {
        return controller;
    }

    /**
     * Sets the value of the controller property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setController(SubscriptionEvent value) {
        this.controller = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setSummary(SubscriptionEvent value) {
        this.summary = value;
    }

    /**
     * Gets the value of the factDate property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getFactDate() {
        return factDate;
    }

    /**
     * Sets the value of the factDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setFactDate(SubscriptionEvent value) {
        this.factDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setStatus(SubscriptionEvent value) {
        this.status = value;
    }

    /**
     * Gets the value of the resume property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getResume() {
        return resume;
    }

    /**
     * Sets the value of the resume property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setResume(SubscriptionEvent value) {
        this.resume = value;
    }

    /**
     * Gets the value of the executor property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEventAdvanceInfo }
     *     
     */
    public SubscriptionEventAdvanceInfo getExecutor() {
        return executor;
    }

    /**
     * Sets the value of the executor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEventAdvanceInfo }
     *     
     */
    public void setExecutor(SubscriptionEventAdvanceInfo value) {
        this.executor = value;
    }

    /**
     * Gets the value of the executorReport property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionEvent }
     *     
     */
    public SubscriptionEvent getExecutorReport() {
        return executorReport;
    }

    /**
     * Sets the value of the executorReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionEvent }
     *     
     */
    public void setExecutorReport(SubscriptionEvent value) {
        this.executorReport = value;
    }

}
