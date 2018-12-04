package conv.Utils;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Config {
    final Map<Integer, String> OGVuid;
    private static Config config;

    public static Config getInstance() throws IOException {
        if(config == null){
            config = new Config();
        }
        return config;
    }

    private Config() throws IOException {
        OGVuid = loadOGV();
    }

    /**
     * Считывает (Если не существует-создает) справочник с uid органов гос власти
     * @returnАссоциативный массив uid:name
     * @throws IOException ошибка при создании нового файла
     */
    private Map<Integer, String> loadOGV() throws IOException {

        File ogv = new File("ogv");
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
                    //TODO: Warning: файл ogv неверный
                }
            }
        }

        return uid;
    }

    public Map<Integer, String> getOGVuid() {
        return OGVuid;
    }
}
