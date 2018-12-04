package conv.Utils;

import conv.POJO.SigInfo;
import org.apache.tika.Tika;
import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.*;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.encoders.Base64;
import sun.security.util.ObjectIdentifier;

import java.io.*;
import java.nio.file.Files;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Pattern;



public class SigParser {
    private File filePath;
    private final DERObjectIdentifier signDateOID = new DERObjectIdentifier("1.2.840.113549.1.9.5"); //OID момента времени подписи
    private final ASN1ObjectIdentifier signEmailOID = new ASN1ObjectIdentifier("1.2.840.113549.1.9.1"); //OID email подписанта

    public SigParser(File filePath) {
        this.filePath = filePath;
    }

    public SigInfo parse() throws IOException, CMSException, ParseException {
        byte[] buffer = Files.readAllBytes(filePath.toPath());
        SigInfo info = new SigInfo();

        if(!isBinary()){
            String fileText = new String(buffer);
            Pattern pattern = Pattern.compile("^--.*--$", Pattern.MULTILINE);
            fileText = pattern.matcher(fileText).replaceAll("");
            buffer = Base64.decode(fileText);
        }

        CMSSignedData signature = new CMSSignedData(buffer);
        Store cs = signature.getCertificates(); //Список всех сертификатов

        SignerInformationStore signers = signature.getSignerInfos(); //Информация о сертификатах, которыми подписан документ
        List c = Arrays.asList(signers.getSigners().toArray());

        if(!c.isEmpty()){
            SignerInformation signer = (SignerInformation) c.get(0);

            /*Получение даты, когда был подписан документ*/
            Attribute attribute = signer.getSignedAttributes().get(signDateOID);
            DERObject derObjectDate = attribute.getAttrValues().getObjectAt(0).getDERObject();
            if (derObjectDate instanceof ASN1UTCTime) {
                info.setSigned(((ASN1UTCTime) derObjectDate).getDate());
            }

            /*Сертификат которым было подписано*/
            Collection certCollection = cs.getMatches(signer.getSID());
            Iterator certIt = certCollection.iterator();
            X509CertificateHolder cert = (X509CertificateHolder) certIt.next();
            /*Данные из сертификата*/
            for (RDN rdn : cert.getSubject().getRDNs()) {
                AttributeTypeAndValue first = rdn.getFirst();
                ASN1Encodable value = first.getValue();
                if(first.getType().equals(signEmailOID)){
                    info.setEmail(value.toString());
                }
                info.addSubject(value.toString());
            }

            /*Контент который был подписан*/
            CMSProcessable sc = signature.getSignedContent();
            if (sc != null) {
                info.setContent((byte[])sc.getContent());
            }
        }

        return info;
    }



    private Boolean isBinary() throws IOException {
        Tika tika = new Tika();
        String detect = tika.detect(filePath);
        if(detect.contains("text")){
            return false;
        }else{
            return true;
        }
    }

}
