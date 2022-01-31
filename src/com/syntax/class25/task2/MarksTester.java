package com.syntax.class25.task2;

public class MarksTester {
    public static void main(String[] args) {
        A a = new A(95, 96, 92);
        System.out.println(a.getPercentage());
        B b = new B(92, 94, 95, 98);



        Marks[] mark = {new A(97, 88, 98),
                new B(100, 97, 98,95)};
        for (Marks m : mark) {
            System.out.println(m.getPercentage());
        }
    }
}
