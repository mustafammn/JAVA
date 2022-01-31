package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Today is Today. Today we have java class.";
		String[] strArr=str.split("[.]");
		
		for(String s:strArr) {
			System.out.println(s);
		}
		
	}

}
