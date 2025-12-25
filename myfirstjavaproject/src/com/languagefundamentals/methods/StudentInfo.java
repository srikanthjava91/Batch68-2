package com.languagefundamentals.methods;

import java.util.Scanner;

public class StudentInfo {

	void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Name  : ");
		String fn = sc.nextLine();

		System.out.println("Enter Last name  :");
		String ln = sc.next();

		System.out.println("Enter Student Age :");
		int age = sc.nextInt();// 22

		System.out.println("Enter Gender ");
		char c = sc.next().charAt(0); // method chaining// Male

		// Calling instance methods in instance main method
		studentAge(age);
		studentFullNameInfo(fn, ln);
		studentGender(c);

		System.out.println("main method ended");
	}

	void studentFullNameInfo(String fname, String lname) {
		System.out.println("Student Full name : " + fname + " " + lname);
	}

	void studentAge(int age) {
		System.out.println("Student Age : " + age);
	}

	void studentGender(char c) {
		System.out.println("Student Gdenr info  :" + c);
	}

	void studentPhone(long phon) {
		System.out.println("Student Phone : " + phon);
	}

	void studentWeight(double weight) {
		System.out.println("Student Weight : " + weight);
	}

	void studentHeight(float height) {
		System.out.println("Student height : " + height);
	}

	void studentCurrentCity(String city) {
		System.out.println("Student current City : " + city);
	}

}
