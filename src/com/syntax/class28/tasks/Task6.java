package com.syntax.class28.tasks;

import java.util.Iterator;
import java.util.TreeSet;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.
         */

        TreeSet<String> countries=new TreeSet<>();
        countries.add("Ukraine");
        countries.add("Germany");
        countries.add("Italy");
        countries.add("France");
        countries.add("Spain");
        countries.add("Belgium");
        countries.add("Turkey");

        System.out.println(countries);
        // getting the data from a Set using enhanced for loop simple for loop not possible because not get method is present in
        //set
        for (String country:countries
             ) {
            System.out.println(country);
        }
        System.out.println("********************");
        // getting the data from a Set using Iterator
        Iterator<String> iterator=countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
