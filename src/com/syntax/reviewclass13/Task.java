package com.syntax.reviewclass13;

public class Task {

    public static void main(String[] args) {
        try {
            checkUserName("isorju");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkUserName(String username)  {
        if (username.length() < 5){
            throw new RuntimeException("The Username should not be less than 5 characters");
        }else {
            System.out.println("You username is correct");
        }
    }
}
