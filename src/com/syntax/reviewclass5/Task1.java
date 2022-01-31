package com.syntax.reviewclass5;

public class Task1 {

	public static void main(String[] args) {
		// Create a 2D array of integer values.
		//Print the sum of all numbers.
		
		int [][] numbers= {{10,10,10,10},{20,20,20,20},{30,30,30,30}};
		

		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=0;j<numbers[i].length;j++) {
			
				sum=sum+numbers[i][j];
			//sum+=numbers[i][j];
			}
			
		}
		System.out.println(sum);
		
		
	}

}
