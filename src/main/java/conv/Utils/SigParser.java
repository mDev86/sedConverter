package conv.Utils;

import conv.Exceptions.CustomWorkExceptions;
import conv.POJO.SigInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.tika.Tika;
import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.*;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.encoders.Base64;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;



public class SigParser {
    /** Путь до файла подписи .sig **/
    private File filePath;
    /** OID момента времени подписи **/
    private final DERObjectIdentifier signDateOID = new DERObjectIdentifier("1.2.840.113549.1.9.5");
    /** OID email подписанта **/
    private final ASN1ObjectIdentifier signEmailOID = new ASN1ObjectIdentifier("1.2.840.113549.1.9.1");

    public SigParser(File filePath) {
        this.filePath = filePath;
    }

    /**
     * Парсинг файла подписи .sig
     * @return Основная информация о подписи
     * @throws CustomWorkExceptions
     */
    public SigInfo parse() throws CustomWorkExceptions {
        try{
            byte[] buffer = Files.readAllBytes(filePath.toPath());
            SigInfo info = new SigInfo();

            if(!isBinary()){
                String fileText = new String(buffer);
                /** Если файл подписи текстовый, то удаляем лишние символы, оставляем только текст в base64 **/
                Pattern pattern = Pattern.compile("^--.*--$", Pattern.MULTILINE);
                fileText = pattern.matcher(fileText).replaceAll("");
                buffer = Base64.decode(fileText);
            }

            CMSSignedData signature = new CMSSignedData(buffer);
            info.setItsel(buffer);
            Store cs = signature.getCertificates(); //Список всех сертификатов

            /** Информация о сертификатах, которыми подписан документ **/
            SignerInformationStore signers = signature.getSignerInfos();
            List c = Arrays.asList(signers.getSigners().toArray());

            if(!c.isEmpty()){
                SignerInformation signer = (SignerInformation) c.get(0);

                /** Получение даты, когда был подписан документ **/
                Attribute attribute = signer.getSignedAttributes().get(signDateOID);
                DERObject derObjectDate = attribute.getAttrValues().getObjectAt(0).getDERObject();
                if (derObjectDate instanceof ASN1UTCTime) {
                    try {
                        info.setSigned(((ASN1UTCTime) derObjectDate).getDate());
                    } catch (ParseException e) {
                        LogManager.getRootLogger().warn("Ошибка считывания подписи: Ошибка преобразования даты подписания документа", e);
                    }
                }

                /** Получаем сертификат, которым был подписан документ **/
                Collection certCollection = cs.getMatches(signer.getSID());
                Iterator certIt = certCollection.iterator();
                X509CertificateHolder cert = (X509CertificateHolder) certIt.next();
                /** Достаем данные о субъекте(владельце) из сертификата **/
                for (RDN rdn : cert.getSubject().getRDNs()) {
                    AttributeTypeAndValue first = rdn.getFirst();
                    ASN1Encodable value = first.getValue();
                    if(first.getType().equals(signEmailOID)){
                        info.setEmail(value.toString());
                    }
                    info.addSubject(value.toString());
                }

                /** Если файл подписи содержит контент(файл) который был подписан **/
                CMSProcessable sc = signature.getSignedContent();
                if (sc != null) {
                    info.setContent((byte[])sc.getContent());
                }
            }

            return info;

        } catch (CMSException e) {
            throw new CustomWorkExceptions("Ошибка считывания подписи: ошибка преобразования данных в подпись", e);
        } catch (IOException e) {
            throw new CustomWorkExceptions(String.format("Ошибка считывания подписи: не удается прочитать файл %s", filePath.getName()), e);
        }
    }

    /**
     * Определяет тип содержимого файла подписи
     * @return False - текстовый; True - бинарный
     */
    private Boolean isBinary() {
        try {
            Tika tika = new Tika();
            String detect = tika.detect(filePath);
            if(detect.contains("text")){
                return false;
            }else{
                return true;
            }
        } catch (IOException e) {
            LogManager.getRootLogger().warn("Ошибка определния типа содержимого файла подписи. Пробуем преобразовать как binary", e);
            return true;
        }

    }

}
