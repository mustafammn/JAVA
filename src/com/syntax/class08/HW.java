package com.syntax.class08;

public class HW {
	
	public static void main(String[] args) {
		
		/*
		 * Calculate sum of all even and all odd numbers from range 1 to 100
		 */
		
		int eSum=0;
		int oSum=0;
		
		for (int i=1; i<=100; i++) {
			
			if (i%2==0) {
				eSum+=i;
			}else {
				oSum+=i;
			}
		
		}
		
		System.out.println("Sum of even numbers = "+eSum);
		System.out.println("Sum of odd numbers = "+oSum);
	}
}
