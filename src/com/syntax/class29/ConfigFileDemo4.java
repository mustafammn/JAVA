package com.syntax.class29;

import com.syntax.utils.ConfigReader;

import java.io.IOException;

public class ConfigFileDemo4 {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("file.separator"));
        System.out.println(ConfigReader.read("Files/Trump.properties","UserName"));
    }
}
