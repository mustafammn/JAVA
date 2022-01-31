package com.syntax.class13;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String userName = "Henok"; String password = "Pass123"; String confirmPass =
		 * "Pass1234";
		 */
		System.out.println("Please enter username");
		Scanner scanner=new Scanner(System.in);
		
		String userName=scanner.nextLine();

		String password = "Pass123"; String confirmPass = "Pass1234";
		if (!(userName.isEmpty() || password.isEmpty())) {
			if (password.length() >= 8) {

				if (!password.contains(userName)) {

					if(password.equals(confirmPass)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords do not match");
					}
					
				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password is too short");
			}

		} else {
			System.out.println("Username and Password cannot be empty");
		}

	}

}
