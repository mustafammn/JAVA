package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash.
		 * 
		 */

		double rate=4.0;
		double homePrice=1000000;
				
		if(rate>4.5) {
			System.out.println("You cannot buy a house");
		}else {
			
			System.out.println("you can buy a house");
			
			if(homePrice>200000) {
				System.out.println("take a loan");
			}else {
				System.out.println("pay cash");
			}
		}
		
		System.out.println("-----------same excersise but nesting in different blocks--------------------------");
		
		if(rate<4.5) {
			System.out.println("you can buy a house");
			
			if(homePrice>200000) {
				System.out.println("take a loan");
			}else {
				System.out.println("pay cash");
			}
			
		}else {
			System.out.println("You cannot buy a house");
		}
	}
}
