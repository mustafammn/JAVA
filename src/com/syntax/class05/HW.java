package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Write costumer age");

		int age = scan.nextInt();

		if (age >= 18) {
			System.out.println("Congratulations we can provide DL");
		} else {
			System.out.println("Unfortunately we cannot provide DL");
		}
	}
}
