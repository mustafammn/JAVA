package com.syntax.class29.tasks;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age,
                  double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printUserInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }


}
