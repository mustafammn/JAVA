package com.syntax.class27.arraytasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
         /*
        Create an arrayList of even numbers from 1 to 500.
        Remove any number that is divisible by 5 from that arrayList.
         */

        ArrayList<Integer> evenNumbers=new ArrayList<>();
        for (int i = 2; i <=50 ; i=i+2) {
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);
        Iterator<Integer> iterator= evenNumbers.iterator();
        while (iterator.hasNext()){
            int number= iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNumbers);
        //break till 2:00
    }
}
