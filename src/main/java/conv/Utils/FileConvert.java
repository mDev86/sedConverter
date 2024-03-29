package conv.Utils;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;
import conv.Exceptions.CustomWorkExceptions;
import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.encoders.Base64;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileConvert {

    /**
     * Преобразование файла из формата base64 в бинарный файл
     * @param base64Content Преобразуемый файл в формате base64
     * @param path Путь сохраняемого файла
     * @throws CustomWorkExceptions
     */
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

    /**
     * Преобразование файла в формат base64
     * @param file Путь до файла
     * @return Строка в формате base64
     * @throws CustomWorkExceptions
     */
    public static String FileToBase64(File file) throws CustomWorkExceptions {
        try {
            byte[] fileContent = FileUtils.readFileToByteArray(file);
            String base64content = java.util.Base64.getEncoder().encodeToString(fileContent);
            return  base64content;
        } catch (IOException e) {
            throw new CustomWorkExceptions("Ошибка преобразования файла в base64. Ошибка считывания.", e);
        }
    }

    /**
     * Создает экземпляр marshaller с экранированием двойных кавычек
     * @param clazz Класс для сереализации
     * @param formattedOutput True - форматированный вывод в файл; False - не форматированный вывод (в одну строку)
     * @return Экземпляр marshaller
     * @throws JAXBException
     */
    public static Marshaller getMarshall(Class clazz, Boolean formattedOutput) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, formattedOutput);
        marshaller.setProperty("jaxb.encoding", "UTF-8");

        marshaller.setProperty(CharacterEscapeHandler.class.getName(),
                new CharacterEscapeHandler() {
                    @Override
                    public void escape(char[] ac, int i, int j, boolean flag,
                                       Writer writer) throws IOException {
                        if (String.valueOf(ac).contains("CDATA")) {
                            writer.write(ac, i, j);
                        } else {
                            StringBuffer buffer = new StringBuffer();

                            Matcher matcher = Pattern.compile("\"").matcher(String
                                    .valueOf(ac));
                            while (matcher.find()) {
                                matcher.appendReplacement(buffer, "&quot;");
                            }
                            matcher.appendTail(buffer);
                            char t[] = buffer.toString().toCharArray();
                            writer.write(t, i, t.length);
                        }
                    }
                });
        return marshaller;
    }

}
