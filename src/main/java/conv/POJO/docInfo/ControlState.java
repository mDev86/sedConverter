
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ControlState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoControl"/>
 *     &lt;enumeration value="UnderControl"/>
 *     &lt;enumeration value="EndedControl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ControlState", namespace = "http://www.eos.ru/2010/sev")
@XmlEnum
public enum ControlState {

    @XmlEnumValue("NoControl")
    NO_CONTROL("NoControl"),
    @XmlEnumValue("UnderControl")
    UNDER_CONTROL("UnderControl"),
    @XmlEnumValue("EndedControl")
    ENDED_CONTROL("EndedControl");
    private final String value;

    ControlState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlState fromValue(String v) {
        for (ControlState c: ControlState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
