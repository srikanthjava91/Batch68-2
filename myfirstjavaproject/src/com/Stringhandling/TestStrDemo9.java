package com.Stringhandling;

import java.util.Scanner;

public class TestStrDemo9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter username : ");
		String user = sc.next();

		System.out.println("Enter password : ");
		sc.nextLine();
		String password = sc.nextLine();

		if (user.equalsIgnoreCase("Admin") && password.equals("Admin#123")) {
			System.out.println("Welcome to Home page : ");
		} else {
			System.err.println("Invalid user credentials !");
		}

	}

}
