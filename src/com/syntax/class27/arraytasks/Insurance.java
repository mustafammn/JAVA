package com.syntax.class27.arraytasks;

public abstract class Insurance {
    /*
     Create a class Insurance that will have an attribute as insuranceName and unimplemented
behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
Car class has it's own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;
    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public  abstract void getQuote();
    public  abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    //String insuranceName; if same name field is present in child and parent class then we should use super keyword with field names
    public Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for car model "+carModel+" from "+insuranceName);
    }

    @Override
    public void cancelInsurance() {

        System.out.println("Cancels the insurance for carModel "+carModel+" from "+insuranceName);
    }
}
class Pet extends Insurance{

    String petType;

    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for Pet of type "+petType+" from "+insuranceName);
    }

    @Override
    public void cancelInsurance() {

        System.out.println("Cancels the insurance for Pet of type "+petType+" from "+insuranceName);
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote "+insuranceName);
    }

    @Override
    public void cancelInsurance() {

        System.out.println("Cancels the insurancefrom "+insuranceName);
    }
}