package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card?");

		String condition = input.next();

		if (condition.equalsIgnoreCase("yes")) {
			
			System.out.println("What is the balance on your credit card?");
			double balance = input.nextDouble();

			if (balance > 1000) {
				System.out.println("Pay it off immediately.");
			} else {
				System.out.println("You need to spend more");
			}
			
		} else {
			System.out.println("Would you like to get a credit card?");
		}
	}
}
