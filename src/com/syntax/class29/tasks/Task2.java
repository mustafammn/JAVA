package com.syntax.class29.tasks;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

         /* 2. Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.*/

        TreeMap<String,String> capital= new TreeMap<>();
        capital.put("USA","WASHINGTON");
        capital.put("TURKEY", "ANKARA");
        capital.put("FRANCE","PARIS");
        capital.put("ITALY","ROME");
       // System.out.println(capital);

        Set<Map.Entry<String,String>> set=capital.entrySet();
        for (Map.Entry<String,String> entry:set
             ) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }

        System.out.println("******************************");
        Iterator<Map.Entry<String,String>> iterator=capital.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry= iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("******************************");
        for (String value:
        capital.values()) {
            System.out.println(value);
        }
        System.out.println("******************************");
        Iterator<String> valueIterator=capital.values().iterator();
        while (valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }

    }
}
