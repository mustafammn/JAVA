package com.syntax.reviewclass5;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a 2D array or integer type where you will store odd
		// and even numbers. Develop a program which will identify/print
		// the even numbers only.
		int[][] numbers = { { 3, 2, 5, 7 }, { 8, 11, 13, 20 }, { 15, 8, 12, 15 } };

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					System.out.println(numbers[i][j]);
				}

			}

		}
	}

}
