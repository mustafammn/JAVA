package com.syntax.reviewclass13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args)  {
        String path="jskdfnks";
        System.out.println("Important lines of code");

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");



    }
}
