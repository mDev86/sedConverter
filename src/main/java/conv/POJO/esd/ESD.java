//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.28 at 12:23:34 PM GMT+05:00 
//


package conv.POJO.esd;

import conv.Exceptions.CustomWorkExceptions;
import conv.Utils.FileConvert;
import conv.Utils.JAXBAdapter.AdapterCDATA;
import org.apache.commons.io.FilenameUtils;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Paths;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Header"/>
 *         &lt;element ref="{}ExtAttributes"/>
 *         &lt;element ref="{}Contents"/>
 *         &lt;element ref="{}DigitalSignatures"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MetadataID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MetadataVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "extAttributes",
    "contents",
    "digitalSignatures"
})
@XmlRootElement(name = "StructuredElectronicObject")
public class ESD
{

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "ExtAttributes", required = true)
    protected ExtAttributes extAttributes;
    @XmlElement(name = "Contents", required = true)
    @XmlJavaTypeAdapter(AdapterCDATA.class)
    @XmlSchemaType(name = "NCName")
    protected String contents;
    @XmlElement(name = "DigitalSignatures", required = true)
    protected DigitalSignatures digitalSignatures;
    @XmlAttribute(name = "MetadataID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String metadataID;
    @XmlAttribute(name = "MetadataVersion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String metadataVersion;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the extAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ExtAttributes }
     *     
     */
    public ExtAttributes getExtAttributes() {
        return extAttributes;
    }

    /**
     * Sets the value of the extAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtAttributes }
     *     
     */
    public void setExtAttributes(ExtAttributes value) {
        this.extAttributes = value;
    }

    /**
     * Gets the value of the contents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        return contents;
    }

    /**
     * Sets the value of the contents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
    }

    /**
     * Gets the value of the digitalSignatures property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalSignatures }
     *     
     */
    public DigitalSignatures getDigitalSignatures() {
        return digitalSignatures;
    }

    /**
     * Sets the value of the digitalSignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalSignatures }
     *     
     */
    public void setDigitalSignatures(DigitalSignatures value) {
        this.digitalSignatures = value;
    }

    /**
     * Gets the value of the metadataID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataID() {
        return metadataID;
    }

    /**
     * Sets the value of the metadataID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataID(String value) {
        this.metadataID = value;
    }

    /**
     * Gets the value of the metadataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataVersion() {
        return metadataVersion;
    }

    /**
     * Sets the value of the metadataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataVersion(String value) {
        this.metadataVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Определяем имя текущего файла
     * @return Имя файла
     */
    public String getFileName() {
        String fileName = this.getHeader().getName();
        //Обрезаем длину имени файла
        fileName = fileName.substring(0, Math.min(fileName.length(), 100));
        fileName += FilenameUtils.getExtension(fileName).equalsIgnoreCase(this.getHeader().getExtension())? "":"." + this.getHeader().getExtension().toLowerCase();

        //Удалям запрещенные в имени файла символы
        fileName = fileName.replaceAll("[\\\\/:*?\"<>|]", "").replaceAll("[–\\|—]", "-");

        return fileName;
    }

    /**
     * Извлекает из текущего esd файл и подписи
     * @param path Путь сохранения файлов
     * @throws CustomWorkExceptions
     */
    public void extractFile(String path) throws CustomWorkExceptions {
        String filePath = Paths.get(path, getFileName()).toString();
        FileConvert.Base64ToFile(this.getContents(), filePath);

        int signNumber = 0;
        for(DigitalSignature sign : this.getDigitalSignatures().getDigitalSignature()){
            String sigPath = String.format("%s.%s.sig", filePath, signNumber);
            FileConvert.Base64ToFile(sign.getData(), sigPath);
            signNumber++;
        }
    }

    /**
     * Сохраняет текущий экземпляр с данными в esd файл (Сериализация)
     * @param path Путь до папки, в которой необходимо сохранить файл
     * @throws JAXBException
     */
    public void saveToFile(String path) throws JAXBException {
        File file = new File(path);
        file.mkdirs();

        /**
         * Из-за ограничения windows на длину пути 260 символов, обрезаем название файла
         */
        String extension = ".esd",
                shotFileName = this.getHeader().name.length() > 259-(path.length()+1 + extension.length()) ? this.getHeader().name.substring(0, 259-(path.length()+1 + extension.length())) : this.getHeader().name;

        file = new File(path,shotFileName + extension);
        FileConvert.getMarshall(ESD.class, true).marshal(this, file);
    }
}
