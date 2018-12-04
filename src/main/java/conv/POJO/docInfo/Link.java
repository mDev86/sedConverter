
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Link complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Link">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eos.ru/2010/sev}BaseComplexType">
 *       &lt;sequence>
 *         &lt;element name="LinkType" type="{http://www.eos.ru/2010/sev}LinkType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DocumentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="URLString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link", namespace = "http://www.eos.ru/2010/sev", propOrder = {
    "linkType"
})
public class Link
    extends BaseComplexType
{

    @XmlElement(name = "LinkType", namespace = "http://www.eos.ru/2010/sev", required = true)
    protected LinkType linkType;
    @XmlAttribute(name = "DocumentID")
    protected String documentID;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "URLString")
    protected String urlString;

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setLinkType(LinkType value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the urlString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLString() {
        return urlString;
    }

    /**
     * Sets the value of the urlString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLString(String value) {
        this.urlString = value;
    }

}
