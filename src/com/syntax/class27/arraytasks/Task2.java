package com.syntax.class27.arraytasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.

         */
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Lamp");
        arrayList.add("Purple");
        arrayList.add("Love");

        // This operation might change the size of original list its not a good idea to use loops without Iterator
        Iterator<String> iterator= arrayList.iterator();
        while (iterator.hasNext()){
          String word= iterator.next();
          if(word.toLowerCase().endsWith("e")){
              iterator.remove();
          }
        }
        System.out.println(arrayList);
    }
}
