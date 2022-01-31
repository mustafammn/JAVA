package com.syntax.reviewclass11;

import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(30);
        arrayList.remove(5); //removes the element at index 5
        arrayList.remove(new Integer(5));  //removing by objects require an object
        Collections.sort(arrayList); // sort the data in ascending order
        System.out.println(arrayList);
        Collections.reverse(arrayList);  // sort the data in descending order
        System.out.println(arrayList);
        Collections.shuffle(arrayList);  //shuffles teh data
        System.out.println(arrayList);


    }
}
