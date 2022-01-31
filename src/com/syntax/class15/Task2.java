package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 */
		String str="kbfbjkdbfASDHBDH123*()";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
	}

}
