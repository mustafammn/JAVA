package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Please, enter your birth month");
		String month = inp.next();

		String season;

		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Jenuary")
				|| month.equalsIgnoreCase("February")) {
			season = "Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Autumn";
		}else {
			season = "Invalid";
		}

		if (!season.equals("Invalid")) {
			System.out.println("You were born is season " + season);
		}
		
	}
}
