package com.syntax.reviewclass5;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array of integers. 
		//Develop a program which will calculate the sum of 
		//even and odd numbers for that array.
		int[][] numbers = { { 3, 2, 5, 7 }, { 8, 11, 13, 20 }, { 15, 8, 12, 15 } };
		int oddSum=0;
		int evenSum=0;
		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					evenSum+=numbers[i][j];
				}else {
					oddSum+=numbers[i][j];
				}

			}

		}
		System.out.println("Sum of even numbers "+evenSum);
		System.out.println("Sum of odd numbers "+oddSum);
	}

}
