package com.syntax.class25.task3;

import java.util.Locale;

public class Registration {
    /*
    Create Registration Class in which you would have variables as email, userName and password that have an access scope
    only within its own class. After creating an object of the class user should be able to call methods and in each method
    separately pass values to set users email, username and password.
Requirements:
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid passwords cannot contain userName.

     */
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.toLowerCase().contains("@yahoo")) {
            this.email = email;
        } else {
            System.out.println("Not a valid email");
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {

        if(userName.length() <= 6){
            System.out.println("User can not empty or less than 6 characters");
        }else {
            this.userName = userName;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()<6){
            System.out.println("Password can not empty or less than 6 characters");
        }else{
            if(password.contains(userName)){
                System.out.println("Password can not contain username");
            }else {
                this.password = password;
            }

        }

    }
}
