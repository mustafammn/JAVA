package com.syntax.class29.tasks;

import java.util.Collection;
import java.util.TreeMap;

public class Task6 {
    public static void main(String[] args) {
        /*Create a Person class with following private fields: name, lastName, age, salary.
         Variables should be initialized through constructor. Inside the class also create a method to print user details.
        In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
        Print each object details.*/
        TreeMap<Integer,Person> personTreeMap=new TreeMap<>();
        Person person = new Person("Jimmy", "Castro", 30, 500000);
        Person person1 = new Person("Sebastian", "Castro", 4, 1000000);
        Person person2 = new Person("Mateo", "Castro", 5, 500000);
        Person person3 = new Person("Carolina", "Rojas", 30, 800000);
        personTreeMap.put(1,person);
        personTreeMap.put(20,person1);
        personTreeMap.put(10,person2);
        personTreeMap.put(15,person3);
        Collection<Person> value = personTreeMap.values();
        for(Person values:value) {
            values.printUserInfo();

        }
    }
}
