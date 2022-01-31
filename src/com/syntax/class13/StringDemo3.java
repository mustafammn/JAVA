package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="This class is easy";
		System.out.println(name.contains("class"));
		System.out.println(name.contains("Lemon"));
		System.out.println(name.contains("i"));
		
		String str2="Hello";
		String str3="helhyjhuylo";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println(str2.toUpperCase().charAt(4));
		System.out.println(str3.indexOf('l',str3.indexOf('l')+1));
		
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,11));
		
		//break till 2:20
	}

}
