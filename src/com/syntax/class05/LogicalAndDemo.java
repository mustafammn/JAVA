package com.syntax.class05;

import java.util.Scanner;

public class LogicalAndDemo {

	public static void main(String[] args) {
		/*
		 *  ask a user to enter a number
		 *  based on the entered # we will define if number is small, medium or large
		 *  
		 *  if number is between 1 and 10 --> small
		 *  if number is between 11 and 100 --> medium
		 *  if number is between 101 and 1000--> large
		 *  if number is more than 1001 --> xlarge
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter any number");
		
		int num=in.nextInt();
		
		if (num<1) {
			System.out.println("Number is 0 or negative");
		
		}else if (num>=1 && num<=10) {
			System.out.println(num+" is small" );
		
		}else if(num>=11 && num<=100) {
			System.out.println(num+" is medium");
		
		}else if(num>=101 && num<=1000) {
			System.out.println(num+ " is large");
		
		}else if (num>=1001){
			System.out.println(num+" is xLarge");
		}
	}
}
