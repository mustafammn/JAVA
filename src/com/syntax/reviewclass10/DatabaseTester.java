package com.syntax.reviewclass10;

public class DatabaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new GoogleDatabase(10);
        dataBase.openDataBase();
        dataBase.readData();
        dataBase.editData();
        dataBase.closeDataBase();
        //Break till 8:45
    }
}
