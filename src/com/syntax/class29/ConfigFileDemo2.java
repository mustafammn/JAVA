package com.syntax.class29;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo2 {
    public static void main(String[] args) throws IOException {
        //location of the file inside our project
        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\config.properties";
        //creating a connection to that file or simply navigating to that file
        FileInputStream fileInputStream=new FileInputStream(path);
        System.out.println(path);
        //that special program that will help use read the data
        Properties properties=new Properties();
        //loading the data inside properties object from the file
        properties.load(fileInputStream);

        //getting the values for corresponding keys
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));
        fileInputStream.close();
    }
}
