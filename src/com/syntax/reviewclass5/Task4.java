package com.syntax.reviewclass5;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of double values using scanner and 
		//calculate the sum of all stored elements in that array
		// break till 8:45
		double [] numbers=new double[5];
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<numbers.length;i++) {
			System.out.println("Please enter the number");
			numbers[i]=scanner.nextDouble();
		}
		double sum=0;
		for(double number:numbers) {
			sum+=number;
		}
		
		System.out.println(sum);
	}

}
