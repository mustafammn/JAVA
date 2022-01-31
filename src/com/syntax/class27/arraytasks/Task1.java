package com.syntax.class27.arraytasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.
         */

        ArrayList<String> cars=new ArrayList<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Ferrari");
        cars.add("Mercedes");
        cars.add(1,"Toyota"); //will be added at index number 1
        System.out.println(cars);
        //First way to retrieve the data from an ArrayList
        System.out.println("**********************");
        for (String car:cars
             ) {
            System.out.println(car); // because we are only using loop to access the elements there is no harm in using the loop
        }
        System.out.println("**********************");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i)+" has "+cars.get(i).length()+" characters");
            //length() method is for string size() method for lists and length is for arrays
        }

        System.out.println("**********************");
        int i=0;
        while (i< cars.size()){
            System.out.println(cars.get(i));
            i++;
        }
        System.out.println("**********************");
        Iterator<String> iterator =cars.iterator();
        //hasNext() returns true if there are still any elements in Iterator
        while (iterator.hasNext()){
            String arr= iterator.next();
            System.out.println(arr);
        }
        System.out.println("**********************");
        System.out.println(cars.get(cars.size()-1));

    }
}
