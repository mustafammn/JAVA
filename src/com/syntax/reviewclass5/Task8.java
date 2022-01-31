package com.syntax.reviewclass5;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		//0 1 1 2 3 5 8 13 21 34....
		
		int previousNumber=0;
		int currentNumber=1;
		int sum=0;
		int numbersToPrint=10;
		System.out.print(previousNumber+" ");
		System.out.print(currentNumber+" ");
		for(int i=0;i<numbersToPrint-2;i++) {
			sum=currentNumber+previousNumber;
			System.out.print(sum+" ");
			previousNumber=currentNumber;
			currentNumber=sum;
		}
		
	}

}
