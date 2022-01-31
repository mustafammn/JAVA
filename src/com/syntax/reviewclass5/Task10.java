package com.syntax.reviewclass5;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a java program to find the second largest number in the array?
		int[] numbers= {40,30,20,10,30};
		int largest=Integer.MAX_VALUE;
		int secondLargest=Integer.MAX_VALUE;
		
		for(int number:numbers) {
			
			if(number>largest) {
				secondLargest=largest;
				largest=number;
			}else if(number>secondLargest && largest!=number) {
				secondLargest=number;
			}
		}
		
		System.out.println("Largest "+largest);
		System.out.println("Second Largest"+ secondLargest);
	}

}
