package conv.POJO;

import conv.POJO.docInfo.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DeloConfig {

    private Sender sender;
    private Recipient recipient;
    private DocumentAuthor documentAuthor;

    public DeloConfig() {

    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public DocumentAuthor getDocumentAuthor() {
        return documentAuthor;
    }

    public void setDocumentAuthor(DocumentAuthor documentAuthor) {
        this.documentAuthor = documentAuthor;
    }

    /**
     * Возвращает данные для docInfo.xml по умолчанию
     * @return
     */
    public static DeloConfig getDefault() {
        DeloConfig dc = new DeloConfig();

        Sender s = new Sender();

        Contact contact = new Contact();
        Econtact ec = new Econtact();
        ec.setType("e");
        ec.setValue("office@uriit.ru");
        contact.getEcontact().add(ec);

        s.setContact(contact);

        Organization organization = new Organization();
        organization.setUID("0801");
        organization.setShortName("АУ ХМАО - Югры \"Югорский научно-исследовательский институт информационных технологий\" (ЮНИИИТ)");

        contact.setOrganization(organization);

        EDMS edms = new EDMS();
        edms.setVersion("5.0.0.1016");
        edms.setUID("0dfffc0f6c4b4f923a8725e63cee4cb1");
        edms.setValue("DIRECTUM");

        s.setEDMS(edms);

        dc.setSender(s);

        Recipient r = new Recipient();

        contact = new Contact();
        ec = new Econtact();
        ec.setType("e");
        ec.setValue("depit@admhmao.ru");
        contact.getEcontact().add(ec);

        organization = new Organization();
        organization.setUID("08");
        organization.setShortName("Департамент информационных технологий Ханты-Мансийского автономного округа - Югры");

        contact.setOrganization(organization);

        r.getContact().add(contact);

        dc.setRecipient(r);

        DocumentAuthor author = new DocumentAuthor();

        contact = new Contact();
        organization = new Organization();
        organization.setUID("0801");
        organization.setShortName("АУ ХМАО - Югры \"Югорский научно-исследовательский институт информационных технологий\" (ЮНИИИТ)");
        contact.setOrganization(organization);

        OfficialPerson person = new OfficialPerson();
        person.setUID("0801d");

        ObjectFactory factory = new ObjectFactory();
        //JAXBElement<String> fio = new JAXBElement<>(new QName("FIO"), String.class, "Мельников А.В.");
        //JAXBElement<String> post = new JAXBElement<>(new QName("Post"), String.class, "Директор");
        person.getRest().add(factory.createOfficialPersonFIO("Мельников А.В."));
        person.getRest().add(factory.createOfficialPersonPost("Директор"));
        contact.setOfficialPerson(person);
        author.setContact(contact);

        dc.setDocumentAuthor(author);

        return dc;
    }


}
