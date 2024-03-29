package conv.Utils.JAXBAdapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;

public class BigDecimalToStringAdapter extends XmlAdapter<String, BigDecimal> {
    @Override
    public BigDecimal unmarshal(String v) throws Exception {
        return new BigDecimal(v);
    }

    @Override
    public String marshal(BigDecimal v) throws Exception {
        return v.toString();
    }
}
