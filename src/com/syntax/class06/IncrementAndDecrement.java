package com.syntax.class06;

public class IncrementAndDecrement {
	
	public static void main(String[] args) {
		
		int num=100;
		
		num=num+1;
		num+=1;
		
		System.out.println(num);
		
		num++;//increment value of variable by 1
		System.out.println(num);
		
		num--;//decrement value of variable by 1
		
		//10++; CANNOT BE USED with values, only with VARIABLE
		
		float f=10.99f;
		f++;
		
		System.out.println(f);
		
	}
}
