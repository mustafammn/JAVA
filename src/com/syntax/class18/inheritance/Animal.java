package com.syntax.class18.inheritance;

public class Animal {
    String name;
   protected String breed;
    String color;
    int age;
    double weight;

    void eat(){
        System.out.println(name+" eating");
    }
    void sleep(){
        System.out.println(name+" Sleeping");
    }
}
