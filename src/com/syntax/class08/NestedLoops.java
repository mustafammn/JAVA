package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {

		/*
		 * nested loop --> loops inside another loop
		 */

		for (int i = 1; i <= 9; i++) { // outer loop
			

			for (int j = 0; j <= 9; j++) { // inner loop

				System.out.println(i+" "+j);

			}

		}

		
		System.out.println("  --------   Car Odometer   -------   ");
		
		for (int a = 0; a <= 9; a++) {
			
			for (int b = 0; b <= 9; b++) {
				
				for (int c = 0; c <= 9; c++) {
					
					for (int d = 0; d <= 9; d++) {
						
						
						System.out.println(a+""+b+""+c+""+d);
					}
				}
			}
		}
		
		System.out.println("  --------   Multiplication Table   -------   ");
		
		for(int i=1; i<=10; i++) {
			
			for(int j=1; j<=10; j++) {
				
				System.out.println(i+" * "+j+" = "+i*j);
			}
			
			System.out.println(" ----------");
		}
		
		System.out.println("  --------   Clock   -------   ");

	}
}
