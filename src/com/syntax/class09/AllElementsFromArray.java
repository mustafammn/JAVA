package com.syntax.class09;

public class AllElementsFromArray {
	
	public static void main(String[] args) {
		
		String[] words= {"Java","Saturday"," day.", "coding ", " is ", "love", "happy"};
		
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		System.out.println(words[3]);
		System.out.println(words[4]);
		
		System.out.println("    ------------------------------------   ");
		
		for(int i=0; i<words.length; i++) {
			
			System.out.println(words[i]);
		}
		
		
		
	}
}
