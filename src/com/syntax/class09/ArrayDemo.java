package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B
		 */
		
		// 1 way of creating an array
		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		
		System.out.println(grades[1]);
		
		int num;//declare a variable
		num=10;//initialize
		
		char[] gender; //declare an array
		gender=new char[2]; //initialize it's size
		
		// 2 way of creating an array
		
		char[] gradesArray= {'A', 'B', 'C', 'D'};
		
		System.out.println(gradesArray.length);//4
		System.out.println("Element with index 2 is "+gradesArray[2]);
		
		//elements inside array always stored based on index (index starts from 0)
		String[] names= {"Oleksandr", "Mehmet", "Emilija", "Naiya"};
		names[0]="Priyasri";//replacing element with index 0
		
		System.out.println("After change value is "+names[0]);
		
		// names[4]="John";//ArrayIndexOutOfBoundsException
		// System.out.println(names[4]); ArrayIndexOutOfBoundsException
		
		String[] cars= {};
		System.out.println(cars.length);
		
		String[] carrs=new String[3];
		
		/*
		 *  CANNOT DECLARE AN ARRAY SEPARATELY IF WE WANT TO STORE VALUES IN SHORTER WAY
		 * 	int[] nums;
			num= {10, 12, 11}; //Compiler will complain on this line
		 */
		
		int[] nums= {10, 12, 56};
		
	}
}
