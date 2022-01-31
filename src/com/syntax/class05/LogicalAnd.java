package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {
	
	public static void main(String[] args) {
		
		boolean understandJava=true;
		boolean enjoyJava=true;
		
		if(understandJava && enjoyJava) {
			System.out.println("That is awesome");
		}else {
			System.out.println("You probbaly need to study more");
		}
	}
}