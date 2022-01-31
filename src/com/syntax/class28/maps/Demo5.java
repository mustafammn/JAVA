package com.syntax.class28.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 4.3);

        System.out.println(grocery);
        Collection<String> keys = grocery.keySet();// to get the keys only separately from map
        System.out.println(keys);
        Collection<Double> values= grocery.values(); // to get the values only separately from map
        System.out.println(values);

    }
}
