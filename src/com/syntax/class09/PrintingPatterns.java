package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {

		for (int r = 1; r <= 4; r++) {

			for (int c = 1; c <= 5; c++) {

				System.out.print(" * ");
			}

			System.out.println();

		}

		System.out.println(" how to print a square 10 X 10 ");

		for (int r = 1; r <= 10; r++) {

			for (int c = 1; c <= 10; c++) {

				System.out.print(" * ");
			}

			System.out.println();
		
		}
	}
}
