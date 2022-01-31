package com.syntax.reviewclass10;

public abstract class DataBase {
    int numberOfConnections; // we can't use abstract keyword with fields
    DataBase(int numberOfConnections){
        this.numberOfConnections=numberOfConnections;
    }
    abstract void openDataBase();
    abstract void readData();
    abstract void editData();
    abstract  void closeDataBase();

}
class MySQLServer extends DataBase{

    MySQLServer(int numberOfConnections) {
        super(numberOfConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the Database From Microsoft");
    }

    @Override
    void readData() {
        System.out.println("Reading the data  From Microsoft Database");
    }

    @Override
    void editData() {
        System.out.println("Editing the data  From Microsoft Database");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the Microsoft Database");
    }
}

class InformixDataBase extends DataBase{

    InformixDataBase(int numberOfConnections) {
        super(numberOfConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the Database From IBM");
    }

    @Override
    void readData() {
        System.out.println("Reading the data  From IBM Database");
    }

    @Override
    void editData() {
        System.out.println("Editing the data  From IBM Database");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the IBM Database");
    }
}

class GoogleDatabase extends DataBase{
    GoogleDatabase(int numberOfConnections) {
        super(numberOfConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the Database From Google");
    }

    @Override
    void readData() {
        System.out.println("Reading the data  From Google Database");
    }

    @Override
    void editData() {
        System.out.println("Editing the data  From Google Database");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the Google Database");
    }
}