
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvanceInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvanceInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdvanceInfoType", namespace = "http://www.eos.ru/2010/sev")
@XmlEnum
public enum AdvanceInfoType {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    AdvanceInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdvanceInfoType fromValue(String v) {
        for (AdvanceInfoType c: AdvanceInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
