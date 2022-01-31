package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a String that will hold a sentence. Write a program to get a 
		 * new String without any spaces. 
		 */
		String str="Me: Look it's not you it's me, walking away)"; 
		System.out.println(str.replace(" ", ""));
		str=str.replaceAll("\\s", "");
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str);
		StringBuilder str2=new StringBuilder("Me: Look it's not you it's me, walking away)");
		System.out.println(str2.reverse());
		System.out.println(str2);
		
	}

}
