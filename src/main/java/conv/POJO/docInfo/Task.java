
package conv.POJO.docInfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Task complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Task">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}UidRequired">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.eos.ru/2010/sev}ResolutionAuthor" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="File" type="{http://www.eos.ru/2010/sev}DeloFile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Executor" type="{http://www.eos.ru/2010/sev}Executor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Control" type="{http://www.eos.ru/2010/sev}Control" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.eos.ru/2010/sev}Category" minOccurs="0"/>
 *         &lt;element name="Parent" type="{http://www.eos.ru/2010/sev}Parent" minOccurs="0"/>
 *         &lt;element name="IsProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TaskID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" use="required" type="{http://www.eos.ru/2010/sev}TaskType" />
 *       &lt;attribute name="Privacy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "number",
    "author",
    "text",
    "file",
    "executor",
    "control",
    "note",
    "category",
    "parent",
    "isProject"
})
public class Task
    extends UidRequired
{

    @XmlElement(name = "Number", namespace = "http://www.eos.ru/2010/sev")
    protected String number;
    @XmlElement(name = "Author", namespace = "http://www.eos.ru/2010/sev")
    protected ResolutionAuthor author;
    @XmlElement(name = "Text", namespace = "http://www.eos.ru/2010/sev")
    protected String text;
    @XmlElement(name = "File", namespace = "http://www.eos.ru/2010/sev")
    protected List<DeloFile> file;
    @XmlElement(name = "Executor", namespace = "http://www.eos.ru/2010/sev")
    protected List<Executor> executor;
    @XmlElement(name = "Control", namespace = "http://www.eos.ru/2010/sev")
    protected Control control;
    @XmlElement(name = "Note", namespace = "http://www.eos.ru/2010/sev")
    protected String note;
    @XmlElement(name = "Category", namespace = "http://www.eos.ru/2010/sev")
    protected Category category;
    @XmlElement(name = "Parent", namespace = "http://www.eos.ru/2010/sev")
    protected Parent parent;
    @XmlElement(name = "IsProject", namespace = "http://www.eos.ru/2010/sev")
    protected boolean isProject;
    @XmlAttribute(name = "TaskID", required = true)
    protected String taskID;
    @XmlAttribute(name = "Type", required = true)
    protected TaskType type;
    @XmlAttribute(name = "Privacy", required = true)
    protected boolean privacy;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionAuthor }
     *     
     */
    public ResolutionAuthor getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionAuthor }
     *     
     */
    public void setAuthor(ResolutionAuthor value) {
        this.author = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeloFile }
     * 
     * 
     */
    public List<DeloFile> getFile() {
        if (file == null) {
            file = new ArrayList<DeloFile>();
        }
        return this.file;
    }

    /**
     * Gets the value of the executor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Executor }
     * 
     * 
     */
    public List<Executor> getExecutor() {
        if (executor == null) {
            executor = new ArrayList<Executor>();
        }
        return this.executor;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link Control }
     *     
     */
    public Control getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link Control }
     *     
     */
    public void setControl(Control value) {
        this.control = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Parent }
     *     
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parent }
     *     
     */
    public void setParent(Parent value) {
        this.parent = value;
    }

    /**
     * Gets the value of the isProject property.
     * 
     */
    public boolean isIsProject() {
        return isProject;
    }

    /**
     * Sets the value of the isProject property.
     * 
     */
    public void setIsProject(boolean value) {
        this.isProject = value;
    }

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskID(String value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TaskType }
     *     
     */
    public TaskType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskType }
     *     
     */
    public void setType(TaskType value) {
        this.type = value;
    }

    /**
     * Gets the value of the privacy property.
     * 
     */
    public boolean isPrivacy() {
        return privacy;
    }

    /**
     * Sets the value of the privacy property.
     * 
     */
    public void setPrivacy(boolean value) {
        this.privacy = value;
    }

}
