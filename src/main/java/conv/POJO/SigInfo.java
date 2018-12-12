package conv.POJO;

import org.apache.logging.log4j.LogManager;

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

    /**
     * Собирает набор данных о владельце сертификата в одну строку
     * @return Строка с информацией о владельце сертификата
     */
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

    /**
     * Преобразует дату подписания документа в формат XMLGregorianCalendar для записи в xml
     * @return
     */
    public XMLGregorianCalendar getSignedToXMLGregorianCalendar(){
        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(Signed);
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            return date2;
        } catch (DatatypeConfigurationException e) {
            LogManager.getLogger("global").warn("Экземпляр информации о подписи: Ошибка преобразования даты: Date -> XMLGregorianCalendar", e);
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
        return java.util.Base64.getEncoder().encodeToString(this.Content);
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

    /**
     * Преобразует подпись в формат base64
     * @return
     */
    public String getItselInBase64(){
        return java.util.Base64.getEncoder().encodeToString(Itsel);
    }
}
