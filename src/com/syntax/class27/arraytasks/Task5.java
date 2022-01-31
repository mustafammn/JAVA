package com.syntax.class27.arraytasks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?
        List<String> aList= new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        Set<String> set=new LinkedHashSet<>(aList);
        aList=new ArrayList<>(set);
        System.out.println(aList);

    }
}
