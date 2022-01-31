package com.syntax.class07;

import java.util.Scanner;

public class HWUsingIfStatement {

	public static void main(String[] args) {
		System.out.println("     CALCULATOR USING IF STATEMENT      ");

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter two number and operator(+,-,*,/)");
		
		double i = in.nextDouble();
		double q = in.nextDouble();
		
		String oper = in.next();
		double sonuc = 0.0;

		if (oper.equalsIgnoreCase("+")) {
			sonuc = i + q;
		} else if (oper.equalsIgnoreCase("-")) {
			sonuc = i - q;
		} else if (oper.equalsIgnoreCase("*")) {
			sonuc = i * q;
		} else if (oper.equalsIgnoreCase("/")) {
			sonuc = i / q;
		} else {
			System.out.println("Wrong operator");
		}

		System.out.println("Sonuc " + sonuc);

	}

}
