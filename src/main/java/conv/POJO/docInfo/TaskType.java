
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Resolution"/>
 *     &lt;enumeration value="Point"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskType", namespace = "http://www.eos.ru/2010/sev")
@XmlEnum
public enum TaskType {

    @XmlEnumValue("Resolution")
    RESOLUTION("Resolution"),
    @XmlEnumValue("Point")
    POINT("Point");
    private final String value;

    TaskType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskType fromValue(String v) {
        for (TaskType c: TaskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
