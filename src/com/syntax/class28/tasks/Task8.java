package com.syntax.class28.tasks;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    /*
    Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.
     */


    public static void main(String[] args) {
        Set<Student> students=new HashSet<>();
        students.add(new Student("Alexey","Cow123"));
        students.add(new Student("Sorbon","Poly123"));
        students.add(new Student("Aysha","AllAutol123"));
        students.add(new Student("Sebastion","Memel123"));
        students.add(new Student("Lubo","Breakl123"));
        students.add(new Student("Asghar","Javal123"));
        for (Student student:students
             ) {
            student.printName();
        }



    }

}
