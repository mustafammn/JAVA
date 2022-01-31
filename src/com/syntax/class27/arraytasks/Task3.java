package com.syntax.class27.arraytasks;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*
                Create an arrayList of drinks(Gentle ones). If any drink has letter “a” or “e” replace it with water.
         */

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Tea");
        arrayList.add("Coffee");
        arrayList.add("Soft drinks");
        arrayList.add("Pepsi");
        arrayList.add("Water");
        arrayList.add("Hot Chocolate");
        arrayList.add("Lemon Tea");

        // Not changing the size of the list and updating the elements so we can't use enhanced forloop
        /*for (int i = 0; i < arrayList.size(); i++) {

            if(arrayList.get(i).toLowerCase().contains("e")||arrayList.get(i).toLowerCase().contains("a")){
                arrayList.set(i,"Water");
            }
        }
        System.out.println(arrayList);*/


        for (int i = 0; i < arrayList.size(); i++) {

            if(arrayList.get(i).toLowerCase().replaceAll("[ae]","").length()< arrayList.get(i).length()){
                arrayList.set(i,"Water");
            }
        }
        System.out.println(arrayList);

    }
}
