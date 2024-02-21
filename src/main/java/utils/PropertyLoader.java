package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {




    public  String getPropertyValue(String propertyName){
        String property;
        try{
            InputStream inputStream = new FileInputStream("src/main/resources/info.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            property = properties.getProperty(propertyName);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return property;
    }
}
