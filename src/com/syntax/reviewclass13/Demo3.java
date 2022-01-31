package com.syntax.reviewclass13;

public class Demo3 {
    public static void main(String[] args)  {
        try {
            checkAge(4,10.2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAge(int age,double weight) throws Exception {

        if(age<5){
            throw new Exception("Age to play");
        }else{
            System.out.println("Go to school");
        }
    }
}
