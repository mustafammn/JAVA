package com.syntax.class29.tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
        /*
        Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
         */
        Set<String> set=new LinkedHashSet<>();
        set.add("chair");
        set.add("sky");
        set.add("tree");
        set.add("sky");

        StringBuilder values= new StringBuilder();
        for (String str:set
             ) {
            values.append(str);
        }

        System.out.println(values); //Break till 1:10
    }
}
