package com.syntax.reviewclass3;

import java.util.Scanner;

public class CharAsInput {

	public static void main(String[] args) {
		
		
		String name=null;
		int number=0;
		System.out.println(number);
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a char");
		char c=scanner.next().charAt(0);
		System.out.println(c);
	}

}
