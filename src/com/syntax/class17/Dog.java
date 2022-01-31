package com.syntax.class17;

public class Dog {

	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	
	public  Dog() {
		//System.out.println("Default Constructor");
		
	}
	
	public  Dog(String dogName,String dogColor,
			String dogBreed, int dogAge,double dogWeight) {
		System.out.println("Dogs constrcutor is called");
		name=dogName;
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		weight=dogWeight;
		System.out.println(dogName);
		printAge();
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public void printBreed() {
		System.out.println(breed);
	}
	
	public void printAge() {
		System.out.println(age);
	}
}
