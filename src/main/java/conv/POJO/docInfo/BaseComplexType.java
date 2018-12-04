
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseComplexType", namespace = "http://www.eos.ru/2010/sev")
@XmlSeeAlso({
    DocumentInfo.class,
    DocumentList.class,
    Address.class,
    TaskList.class,
    Expansion.class,
    DocumentControl.class,
    Recipient.class,
    Sender.class,
    ResourceList.class,
    SubscriptionEvent.class,
    Link.class,
    RegistrationInfo.class,
    Parent.class,
    Subscriptions.class,
    Visa.class,
    Control.class,
    Passport.class,
    UidRequired.class,
    ResolutionAuthor.class,
    UidOptional.class,
    Addressee.class,
    Contact.class,
    TaskDecoration.class,
    MessageHeader.class,
    DocumentAuthor.class,
    Writer.class
})
public abstract class BaseComplexType {


}
