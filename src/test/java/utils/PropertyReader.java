package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    Properties properties = new Properties();
    InputStream inputstream = null;


    public PropertyReader()
    {
        loadProperties();

    }

    public void loadProperties() {
        try {
            inputstream = new FileInputStream("src/config.properties");
            properties.load(inputstream);
        }
      catch(Exception e) {
          System.out.println("Error in reading property");
      }
    }

    public String readProperty(String key) {

        return properties.getProperty(key);

    }
}
