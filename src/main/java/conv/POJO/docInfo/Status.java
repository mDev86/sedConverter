
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="AtSight"/>
 *     &lt;enumeration value="Initialed"/>
 *     &lt;enumeration value="AtSignature"/>
 *     &lt;enumeration value="Signed"/>
 *     &lt;enumeration value="NotSigned"/>
 *     &lt;enumeration value="AtRegistration1"/>
 *     &lt;enumeration value="AtRegistration2"/>
 *     &lt;enumeration value="Registered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Status", namespace = "http://www.eos.ru/2010/sev")
@XmlEnum
public enum Status {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("AtSight")
    AT_SIGHT("AtSight"),
    @XmlEnumValue("Initialed")
    INITIALED("Initialed"),
    @XmlEnumValue("AtSignature")
    AT_SIGNATURE("AtSignature"),
    @XmlEnumValue("Signed")
    SIGNED("Signed"),
    @XmlEnumValue("NotSigned")
    NOT_SIGNED("NotSigned"),
    @XmlEnumValue("AtRegistration1")
    AT_REGISTRATION_1("AtRegistration1"),
    @XmlEnumValue("AtRegistration2")
    AT_REGISTRATION_2("AtRegistration2"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered");
    private final String value;

    Status(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status fromValue(String v) {
        for (Status c: Status.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
