
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Decimal"/>
 *     &lt;enumeration value="Flag"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalFieldType", namespace = "http://www.eos.ru/2010/sev")
@XmlEnum
public enum AdditionalFieldType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Flag")
    FLAG("Flag");
    private final String value;

    AdditionalFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdditionalFieldType fromValue(String v) {
        for (AdditionalFieldType c: AdditionalFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
