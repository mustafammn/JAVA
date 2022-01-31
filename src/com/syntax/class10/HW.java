package com.syntax.class10;

public class HW {
	
	public static void main(String[] args) {
		
		//Create an array to store double values and then print those in reverse order
						//  0	   1	 2		3
		double[] numbers= {10.50,07.99,11.88,22.66};
		
		System.out.println(numbers.length);
		
		//from 1 to last element
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
		
		//from last element to first
		
		for(int i=numbers.length-1; i>=0; i--) {
			
			System.out.println(numbers[i]);
		}
		
		//we cannot use enhanced for loop to travel back in an array
		//for each loops always loops 1 direction: start -> end
		
	}
}
