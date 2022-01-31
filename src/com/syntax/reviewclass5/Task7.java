package com.syntax.reviewclass5;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a java program to check whether a given number is prime or not?
		//

		// all negative numbers are not prime
		// number 0 and 1 are also not prime
		// if a positive number is not divisible by any other number than it is prime
		int number = -15;
		boolean isPrime = true;
		if (number > 1) {

			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

		} else {
			isPrime = false;
		}

		if (isPrime) {
			System.out.println(number + " is prime ");
		} else {
			System.out.println(number + " is not prime ");
		}

	}

}
