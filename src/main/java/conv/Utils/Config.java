package conv.Utils;

import conv.POJO.DeloConfig;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Config {
    final Map<Integer, String> OGVuid;
    private DeloConfig deloConfig;
    private static Config config;

    public static Config getInstance() throws IOException {
        File folderConf = new File("conf");
        if (!folderConf.exists()) {
            folderConf.mkdir();
        }

        if(config == null){
            config = new Config();
        }
        return config;
    }

    private Config() throws IOException {
        OGVuid = loadOGV();
        try {
            deloConfig = loadDeloConf();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Считывает (Если не существует-создает) справочник с uid органов гос власти
     * @returnАссоциативный массив uid:name
     * @throws IOException ошибка при создании нового файла
     */
    private Map<Integer, String> loadOGV() throws IOException {

        File ogv = new File("conf\\ogv");
        if(!ogv.exists()){
            FileOutputStream fos = new FileOutputStream(ogv);
            fos.write(FileUtils.readFileToByteArray(new File(getClass().getClassLoader().getResource("UIDogv").getFile())));
            fos.close();
        }

        Map<Integer, String> uid = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ogv))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(";");
                try {
                    uid.put(Integer.parseInt(split[0]), split[1]);
                }catch (NumberFormatException e){
                    LogManager.getRootLogger().warn(String.format("Считывание конфигурации: не удалось преобразовать строку \"%s\"", line));
                }
            }
        }

        return uid;
    }

    public Map<Integer, String> getOGVuid() {
        return OGVuid;
    }

    private DeloConfig loadDeloConf() throws JAXBException {
        DeloConfig result = null;

        File file = new File("conf\\DeloConfig.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(DeloConfig.class);
        if (file.exists()) {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            result = (DeloConfig) unmarshaller.unmarshal(file);
        } else {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            result = DeloConfig.getDefault();

            marshaller.marshal(result, file);
        }

        return result;
    }

    public DeloConfig getDeloCofig() {
        return deloConfig;
    }
}
