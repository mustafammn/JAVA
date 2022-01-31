package com.syntax.class28.tasks;

import java.util.*;

public class Task7 {
    public static void main(String[] args) {

        /*
        Create a Set of cities in which you want to make sure that insertion
        order is maintained. Then remove any city that starts with “A”;
         */

        Set<String> cities = new LinkedHashSet<>();
        cities.add("New York City");
        cities.add("Yonkers");
        cities.add("Rochester");
        cities.add("Albany");
        cities.add("Buffalo");
        System.out.println(cities);

        Iterator<String> iterator= cities.iterator();
        while (iterator.hasNext()){
            String city= iterator.next();
            if(city.startsWith("A")){ //checking if a string starts with A or not
                iterator.remove(); //removing that city from the set
            }
        }
        System.out.println(cities);

    }
}
