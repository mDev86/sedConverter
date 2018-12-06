
@XmlSchema(
        namespace = "http://www.eos.ru/2010/sev",
        elementFormDefault= XmlNsForm.QUALIFIED,
        xmlns={
                @XmlNs(prefix="", namespaceURI="http://www.eos.ru/2010/sev"),
                @XmlNs(prefix="xsi", namespaceURI="http://www.w3.org/2001/XMLSchema-instance"),
                @XmlNs(prefix="xsd", namespaceURI="http://www.w3.org/2001/XMLSchema")
        }
)
package conv.POJO.docInfo;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;