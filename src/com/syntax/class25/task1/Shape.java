package com.syntax.class25.task1;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as
    calculateArea and calculatePerimeter . Create two classes,
    that will implement functionality defined in Shape Interface.
    Test your code.
     */
     void calculateArea( double a);
     void calculatePerimeter(double a);
}
class Circle implements Shape{

    @Override
    public void calculateArea(double radius) {
        System.out.println("Area of circle "+(change(Math.PI*Math.pow(radius,2),4)));
    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("Perimeter of circle "+(change(2*Math.PI*radius,2)));
    }

    static double change(double value, int decimalpoint)
    {

        // Using the pow() method
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);

        System.out.println(value);

        return value;
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double length) {
        System.out.println("Area of Square "+(change(length*length,2)));
    }

    @Override
    public void calculatePerimeter(double length) {
        System.out.println("Perimeter of circle "+(change(4*length,2)));
    }

    static double change(double value, int decimalpoint)
    {

        // Using the pow() method
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);

        System.out.println(value);

        return value;
    }
}