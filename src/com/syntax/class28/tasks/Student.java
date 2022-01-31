package com.syntax.class28.tasks;

public class Student {
    String name;
    String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    void printName(){
        System.out.println(name);
    }
}
