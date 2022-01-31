package com.syntax.class10;

public class TwoDArraysDemo2 {
	
	public static void main(String[] args) {
		
		//let's create an 2D array of groceries
		
		String[][] groceries= {
							 
								{"banana", "apple", "mango"},//0
								{"potato", "tomato"},//1
								{"milk", "cheese", "ayran", "yogurt"}//2
				
								};
		
		System.out.println(groceries.length);//#of arrays
		System.out.println(groceries[2][3]);//yogurt
		
		//I want to find how many elements my 1 array has
		System.out.println("# of elements inside 1 array= "+groceries[0].length);
		System.out.println("# of elements inside 2 array= "+groceries[1].length);
		System.out.println("# of elements inside 3 array= "+groceries[2].length);
		
		//how do we get all elements from 2D array??????????
		int total=0;
		
		for(int i=0; i<groceries.length; i++) { //iterates over arrays or rows
			
			for (int j=0; j<groceries[i].length; j++) { //iterates over elements of each single array or cols
				
				String element=groceries[i][j];
				
				System.out.println(element);
				
				if (element.equals("ayran")) {
					
					System.out.println(i+" "+j);
				}
				total++;
			}
			
			System.out.println();
		}
		
		System.out.println("# of elements inside 2D array is = "+total);
		
		
		System.out.println("-------------------------------------------------------");
		
	}
}
