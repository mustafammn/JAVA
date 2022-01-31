package com.syntax.class15;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog=new Dog();
		dog.name="casper";
		dog.color="Black";
		dog.sleep();
		dog.noOfLegs=4;
		
		Dog dog2=new Dog();
		//dog2.name="caspersky";
		//dog2.color="White";
		dog2.sleep();
		System.out.println(dog2.noOfLegs);
		System.out.println(dog2.name);
		
	}

}
