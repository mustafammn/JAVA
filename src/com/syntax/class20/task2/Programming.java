package com.syntax.class20.task2;

public class Programming {

   public Programming(){
        System.out.println("I love programming languages");
    }

    public Programming(String value){
        System.out.println("I love "+value);
    }
    /*
    Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages"
    should be printed. If some String is passed to it, then in place of
    "programming languages" the value variable should be printed.
     Example, if we pass "Java", then "I love Java" should be printed.
     */
    public static void main(String[] args) {
        new Programming();
        new Programming("Java");

    }

}
