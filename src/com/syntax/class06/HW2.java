package com.syntax.class06;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {

		int quizScore, midGrade, finalScore, average;
		char grade;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter Quiz score");
		quizScore = scan.nextInt();
		System.out.println("Please enter Midgrade score");
		midGrade = scan.nextInt();
		System.out.println("Please enter Final score");
		finalScore = scan.nextInt();

		average = (quizScore + midGrade + finalScore) / 3;

		if (average >= 90) {
			grade = 'A';
		} else if (average >= 70 && average < 90) {
			grade = 'B';
		} else if (average >= 50 && average < 70) {
			grade = 'C';
		} else if (average < 50) {
			grade = 'F';
		} else {
			grade = ('E');
		}

		System.out.println("Your grade is " + grade + " and your average is " + average);
	}
}
