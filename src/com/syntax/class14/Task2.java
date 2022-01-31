package com.syntax.class14;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		// Break till 8:38
		String fathersName="Daniel"; //7/2=>3
		String mothersName="Mary"; //2
		String isBoyGirl="girl";
		if(isBoyGirl.equalsIgnoreCase("Boy")) {
			String firstPart=fathersName.substring(0,fathersName.length()/2);
			String secondPart=mothersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		}else {
			String firstPart=mothersName.substring(0,fathersName.length()/2);
			String secondPart=fathersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
		}
	}

}
