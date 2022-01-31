package com.syntax.class25.task2;

import com.syntax.utils.MathUtil;

public abstract class Marks {
    double course1Marks;
    double course2Marks;
    double course3Marks;

    public Marks(double course1Marks, double course2Marks, double course3Marks) {
        this.course1Marks = course1Marks;
        this.course2Marks = course2Marks;
        this.course3Marks = course3Marks;
    }

    /*
        We have to calculate the percentage of marks obtained in three subjects
        (each out of 100) by student A and in four subjects (each out of 100) by student B.
         Create class 'Marks' with an abstract method 'getPercentage'. It is inherited by
         classes 'A' and 'B' each having a method with the same name which returns the
         percentage of the students. The constructor of student A takes the marks in three
         subjects as its parameters and the marks in four subjects as its parameters for student B.
         Test your code
         */
    abstract double getPercentage();
}
class A extends Marks{
    public A(double course1Marks, double course2Marks, double course3Marks) {
        super(course1Marks, course2Marks, course3Marks);
    }

    @Override
    double getPercentage() {
     return MathUtil.trimDecimalNumbers((course1Marks+course2Marks+course3Marks)/3,2);
    }
}
class B extends Marks{
    double course4Marks;
    public B(double course1Marks, double course2Marks, double course3Marks,double course4Marks) {
        super(course1Marks, course2Marks, course3Marks);
        this.course4Marks=course4Marks;
    }

    @Override
    double getPercentage() {
        return MathUtil.trimDecimalNumbers((course1Marks+course2Marks+course3Marks+course4Marks)/4,2);
    }


}
