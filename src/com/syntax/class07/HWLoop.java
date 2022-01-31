package com.syntax.class07;

public class HWLoop {

	public static void main(String[] args) {

		// Print even numbers from 20 to 100

		int i = 20;

		while (i <= 100) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();
		
		
		System.out.println("   ANOTHER WAY ");

		int c = 20;
		
		while (c <= 100) {
			
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			
			c++;	
		}
		
		System.out.println(" -----  End of the code -----");
	}
}
