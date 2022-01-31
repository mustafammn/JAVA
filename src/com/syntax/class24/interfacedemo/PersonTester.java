package com.syntax.class24.interfacedemo;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new SDETInstructor();
        person.eat();
        person.sleep();
   /*   person.teach();
        person.work();*/


        Employee employee=new SDETInstructor();
        employee.work();
        //employee.eat();
        SyntaxEmployees syntaxEmployees=new SDETInstructor();
        syntaxEmployees.teach();
        syntaxEmployees.eat();
        syntaxEmployees.work();
        syntaxEmployees.sleep();

        SDETInstructor sdetInstructor=new SDETInstructor();
        sdetInstructor.teach();
        sdetInstructor.eat();
        sdetInstructor.work();
        sdetInstructor.sleep();
        //break till 12:10
    }
}
