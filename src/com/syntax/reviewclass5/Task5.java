package com.syntax.reviewclass5;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of countries.
		// * While retrieving all values from an array print capital for each country.
		//* (use 2 different loops).
		String [] countries= { "Macedonia", "Serbia", "Bulgaria", "Turkey" };
		
		for(String country:countries) {
			if(country.equals("Macedonia")) {
				System.out.println("Skopje");
			}else if(country.equals("Serbia")) {
				System.out.println("Belgrade");
			}else if (country.equals("Bulgaria")) {
				System.out.println("Sofia");
			}else {
				System.out.println("Ankara");
			}
		}
		System.out.println("**********");
		for(int i=0; i<countries.length;i++) {
			
			switch(countries[i]) {
			case "Macedonia":
				System.out.println("Skopje");
				break;
			case "Serbia":
				System.out.println("Belgrade");
				break;
			case "Bulgaria":
				System.out.println("Sofia");
				break;
			case "Turkey":
				System.out.println("Ankara");
				break;
			}
		}
		
	}

}
