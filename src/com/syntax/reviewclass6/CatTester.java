package com.syntax.reviewclass6;

public class CatTester {

    public static void main(String[] args){
        Cat c = new Cat();
        c.name = "bob";
        c.breed = "persian";
        c.color = "black";
        c.age = 5;

        System.out.println("My cat name is: " + c.name);
        System.out.println("My cat belongs to " + c.breed + " society");
        System.out.println("My cat's color is " + c.color);

        Cat c2 = new Cat();
        c2.name = "brisk";
        c2.breed = "siberian";
        c2.color = "white";
        c2.age = 3;

        System.out.println("My cat name is: " + c2.name);
        System.out.println("My cat belongs to " + c2.breed + " society");
        System.out.println("My cat's color is " + c2.color);




    }
}
