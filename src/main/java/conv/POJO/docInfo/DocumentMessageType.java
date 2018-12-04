
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentMessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MainDoc"/>
 *     &lt;enumeration value="AddToDoc"/>
 *     &lt;enumeration value="Reception"/>
 *     &lt;enumeration value="Failure"/>
 *     &lt;enumeration value="Report"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentMessageType", namespace = "http://www.eos.ru/2010/sev")
@XmlEnum
public enum DocumentMessageType {

    @XmlEnumValue("MainDoc")
    MAIN_DOC("MainDoc"),
    @XmlEnumValue("AddToDoc")
    ADD_TO_DOC("AddToDoc"),
    @XmlEnumValue("Reception")
    RECEPTION("Reception"),
    @XmlEnumValue("Failure")
    FAILURE("Failure"),
    @XmlEnumValue("Report")
    REPORT("Report");
    private final String value;

    DocumentMessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentMessageType fromValue(String v) {
        for (DocumentMessageType c: DocumentMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
