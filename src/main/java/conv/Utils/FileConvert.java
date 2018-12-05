package conv.Utils;

import conv.Exceptions.CustomWorkExceptions;
import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.encoders.Base64;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileConvert {

    public static void Base64ToFile(String base64Content, String path) throws CustomWorkExceptions{
        try {
            FileOutputStream fos = new FileOutputStream(path, false);
            fos.write(Base64.decode(base64Content));
            fos.flush();
            fos.close();
        }catch (FileNotFoundException e) {
            throw new CustomWorkExceptions("Ошибка преобразования base64 в файл.", e);
        } catch (IOException e) {
            throw new CustomWorkExceptions("Ошибка преобразования base64 в файл. Ошибка записи.", e);
        }
    }

    public static String FileToBase64(File file) throws CustomWorkExceptions {
        try {
            byte[] fileContent = FileUtils.readFileToByteArray(file);
            String base64content = java.util.Base64.getEncoder().encodeToString(fileContent);
            return  base64content;
        } catch (IOException e) {
            throw new CustomWorkExceptions("Ошибка преобразования файла в base64. Ошибка считывания.", e);
        }
    }

}
