package com.syntax.reviewclass13;

public class ConfusionException extends Exception{
    // to create checked exception extend from Exception class
    //for non-checked exceptions extend from RuntimeException class
    ConfusionException(String msg){
        super(msg);
    }

}
