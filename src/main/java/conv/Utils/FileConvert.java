package conv.Utils;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.encoders.Base64;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileConvert {

    public static void Base64ToFile(String base64Content, String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path, false);
        fos.write(Base64.decode(base64Content));
        fos.flush();
        fos.close();
    }

    public static String FileToBase64(File file) throws IOException {
        byte[] fileContent = FileUtils.readFileToByteArray(file);
        String base64content = java.util.Base64.getEncoder().encodeToString(fileContent);
        return  base64content;
    }

}
