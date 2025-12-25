package com.languagefundamentals.methods;

import java.util.Scanner;

//No return type + with arguments
public class TestMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		// To read the elements from the console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String nm = sc.next();

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		System.out.println("Enter your phone : ");
		long phone = sc.nextLong();

		// calling the static methods by passing value : Call by value
		getName(nm);
		getAge(age);
		userPhone(phone);

	}

	static void getName(String sname) {
		System.out.println("User Name : " + sname);
	}

	static void getAge(int age) {
		System.out.println("User age : " + age);
	}

	static void userPhone(long phone) {
		System.out.println("User phone : " + phone);
	}

}
