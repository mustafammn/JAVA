package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {

		/*
		 * we need to capture a country from a user based on the country we have to
		 * define a favorite food
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a country");
		String count = scan.next();
		String food;

		switch (count.toLowerCase()) {

		case "ukraine":
			food = "Borsh";
			break;
		case "usa":
			food = "burger";
			break;
		case "italy":
			food = "Pizza";
			break;
		case "mexico":
			food = "Tacos";
			break;
		default:
			food = "Unknown";
		}
		

		if (!food.equals("Unknown")) {
			System.out.println("If your country is " + count + (" your favorite food is ") + food);
		
		}else {
			System.out.println("Please try another country");
		}
	}
}
