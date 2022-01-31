package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String read(String path, String key) throws IOException {
        FileInputStream fileInputStream = null;
        Properties properties = null;
        try {
            //opening that file
            fileInputStream = new FileInputStream(path);
            //creating the object of Properties class
            properties = new Properties();
            //loading all the properties from that file inside the properties object
            properties.load(fileInputStream);
            //getting the value for a specific key and returning it  
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        //checking if properties objects is not null so that we don't get null pointer exception
        return properties != null ? properties.getProperty(key) : null;
    }

    public static String read(String key) throws IOException {
        return read("Files/config.properties", key);
    }
}
