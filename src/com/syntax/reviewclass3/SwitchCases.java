package com.syntax.reviewclass3;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 2;

		String monthName=null;
		if (month == 1) {
			monthName="Jan";
		} else if (month == 2) {
			monthName="Feb";
		} else if (month == 3) {
			monthName="Mar";
		} else if (month == 4) {
			monthName="Apr";
		} else if (month == 5) {
			monthName="May";
		} else if (month == 6) {
			monthName="Jun";
		}
		System.out.println(monthName);
		
		switch(month) {
		
		case 1:
			System.out.println("Jan");
		break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
			
		}
		
		
		
	}

}
