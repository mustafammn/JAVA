package com.syntax.reviewclass11;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer wrapperNumber=10;
        int number=(int)wrapperNumber;
        number=wrapperNumber.intValue();
        number=Integer.valueOf(wrapperNumber);
    }
}
