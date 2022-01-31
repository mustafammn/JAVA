package com.syntax.reviewclass10;

public interface Drawable {
   //final void draw(); // Added by the compiler automatically we can't use final with methods
   //private void draw(); private and protected access modifiers are not allowed
    //static void draw(); static keyword is also not allowed
    // int paperSize; can't left fields as un-initialized because fields are final
    //abstract int paperSize=12; abstract keyword is not allowed with fields anywhere
    // private int paperSize=12; private and protected access modifiers are not allowed
    int paperSize=12; // interface fields are public static and final by default
    //we don't have constructors in the interfaces because there are no instance fields
    void  draw();
    static void staticMethod(){
        System.out.println(" I am a static method inside an interface");
    }
    default void defaultMethod(){
        System.out.println("I am a default method");
    }
}
class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
