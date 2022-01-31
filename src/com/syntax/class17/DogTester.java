package com.syntax.class17;

import java.util.Scanner;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog=new Dog("Boby","Black","BullDog",10,12.5);
		//dog.name="Boby" Not allwoed as its private
		
		dog.printAge();
		dog.printName();
		
		Scanner scanner=new Scanner(System.in);
		StringBuilder strBuilder=new StringBuilder("Str");
		//Break till 11:45
		
	}

}
