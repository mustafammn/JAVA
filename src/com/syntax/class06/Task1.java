package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the country");

		String country = scan.next();
		String languge = null;
		
		switch (country.toUpperCase()) {
		
		case "USA":
		case "ENGLAND":
		case "AUSTRALIA":
			languge = "English";
			break;
		case "AFGHANISTAN":
			languge = "Dari";
			break;
		case "TURKEY":
			languge = "turkish";
			break;
		default:
			languge = ("Please enter another country");
		}
		
		System.out.println("In " + country + " people speak in " + languge);

	}
}
