package com.syntax.class05;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter today's day");

		int day = scan.nextInt();

		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");

		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");

		} else {
			System.out.println("Invalid day");
		}

		System.out.println(" ----------  Another way -----------------");

		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter a number of day");
		int weekday = inp.nextInt();

		if (weekday >= 1 && weekday <= 5) {
			System.out.println("It is a weekday");
		
		} else if (weekday >= 6 && weekday <= 7) {
			System.out.println("It is a weekend");
		
		} else {
			System.out.println("Invalid day");
		}
	}
}
