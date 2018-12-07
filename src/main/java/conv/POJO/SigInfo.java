package conv.POJO;

import org.apache.logging.log4j.LogManager;
import org.bouncycastle.util.encoders.Base64;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SigInfo{
    private List<String> Subject;
    private Date Signed;
    private String Email;
    private byte[] Itsel;
    private byte[] Content;

    public SigInfo() {
        Subject = new ArrayList<>();
    }

    public List<String> getSubject() {
        return Subject;
    }

    public String getConcatSubject() {
        StringBuilder builder = new StringBuilder();
        this.Subject.forEach(it -> builder.append(it+","));
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }

    public void addSubject(String subject) {
        Subject.add(subject);
    }

    public Date getSigned() {
        return Signed;
    }

    public XMLGregorianCalendar getSignedToXMLGregorianCalendar(){
        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(Signed);
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            return date2;
        } catch (DatatypeConfigurationException e) {
            LogManager.getRootLogger().warn("Экземпляр информации о подписи: Ошибка преобразования даты: Date -> XMLGregorianCalendar", e);
            return null;
        }
    }

    public void setSigned(Date signed) {
        Signed = signed;
    }

    public byte[] getContent() {
        return Content;
    }

    public String getBase64Content(){
        return new String(Base64.encode(this.Content));
    }

    public void setContent(byte[] content) {
        Content = content;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public byte[] getItsel() {
        return Itsel;
    }

    public void setItsel(byte[] itsel) {
        Itsel = itsel;
    }

    public String getItselInBase64(){
        return java.util.Base64.getEncoder().encodeToString(Itsel);
    }
}
