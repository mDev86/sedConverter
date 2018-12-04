
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sign"/>
 *     &lt;enumeration value="Visa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApprovalKind", namespace = "http://www.eos.ru/2010/sev")
@XmlEnum
public enum ApprovalKind {

    @XmlEnumValue("Sign")
    SIGN("Sign"),
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    ApprovalKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApprovalKind fromValue(String v) {
        for (ApprovalKind c: ApprovalKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
