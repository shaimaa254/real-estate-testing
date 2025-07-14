package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
        private static Properties properties;

        static {
            try {
                FileInputStream input = new FileInputStream("src/main/resources/config.properties");
                properties = new Properties();
                properties.load(input);
            } catch (IOException e) {
                throw new RuntimeException("Could not read config.properties file", e);
            }
        }

        public static String get(String key) {
            return properties.getProperty(key);
        }
    }


