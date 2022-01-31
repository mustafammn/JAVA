package com.syntax.reviewclass6;

public class MethodClass {

    int a = 10;

    void welcomeBatch11(){
        System.out.println("Batch 11 has an immense potential");
    }

    void printMultipleEntities(){
        for(int i =0; i<a; i++){
            System.out.println(i);
        }
    }

    void takeArguments(String name){
        System.out.println(name + " is a bright student");
    }

    void studentRecord(String name, int id, String course, String division){

        System.out.println(name + " is having the id number " +
                id + " enrolled for the course " +
                course + " and secured " + division +
                " division in last exams");
    }

    void checkBoolean(boolean isStudentStudy){
        if(isStudentStudy){
            System.out.println("Student will get a job for sure");
        }else{
            System.out.println("Student will join batch 12 as well");
        }

    }
}
