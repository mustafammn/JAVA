package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
        // Creating an object of Dog class
		Dog alonasDog= new Dog();
		alonasDog.name="Lexy";
		alonasDog.breed="american hound";
		alonasDog.color="Black";
		alonasDog.height=2.5;
		alonasDog.age=10;
		alonasDog.gender='M';
		
		System.out.println("My Dog Name is "+alonasDog.name);
		System.out.println("His Breed is "+alonasDog.breed);
		System.out.println("His color is "+alonasDog.color);
		
		Dog jimmaysDog= new Dog();
		jimmaysDog.name="Teddy";
		jimmaysDog.breed="Labrador Retriever";
		jimmaysDog.color="Golden";
		jimmaysDog.height=5;
		jimmaysDog.gender='M';
		
		System.out.println("My Dog Name is "+jimmaysDog.name);
		System.out.println("His Breed is "+jimmaysDog.breed);
		System.out.println("His color is "+jimmaysDog.color);
		
		Dog arwasDog=new Dog();
		arwasDog.name="manroe";
		
		System.out.println("Arwas Dog is "+arwasDog.name);
	}

}
