package com.syntax.class07;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		// I want to ask a user their name and age 5 times

		Scanner scan = new Scanner(System.in);

		int i = 1;

		while (i <= 5) {

			System.out.println("Please enter your name and age");

			String name = scan.next();
			int age = scan.nextInt();

			System.out.println("You name is " + name + " and you are " + age + " years old");

			i++;

		}

	}
}
