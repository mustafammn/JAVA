package com.syntax.class06;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		/*
		 * rules:
		 * 	1. values in case MUTS be same datatype as a VARIABLE in switch
		 * 	2. We can not have Duplicate Cases
		 */
		
		char gender='h';
		String description;
		
		switch(gender) {
		
		case 'm':
			description="Male";
			break;
		case 'M':
			description="Male";
			break;
		case 'f':
			description="Female";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="Unknown";
		}
		
		System.out.println(gender +" means "+description);
		
		/*
		 * limitation of operators
		 * 1. we cannot use logical Operators
		 * 2. we cannot use relational operators
		 * 
		 * limitation of data types
		 * 1. cannot use boolean
		 * 2. cannot be used with double/float
		 * 2. cannot be used with long
		 */
	}
}
