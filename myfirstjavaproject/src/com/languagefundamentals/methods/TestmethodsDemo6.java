package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestmethodsDemo6 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your age ");
		int age = sc.nextInt();
		System.out.println("Age is : " + age);

		System.out.println("Enter your contry Name : ");
		sc.nextLine();
		String country = sc.nextLine();
		System.out.println("Country  is : " + country);

		System.out.println("Enter you city : ");
		String city = sc.nextLine();
		System.out.println("City  is : " + city);

		System.out.println("main method ended");

	}

}
