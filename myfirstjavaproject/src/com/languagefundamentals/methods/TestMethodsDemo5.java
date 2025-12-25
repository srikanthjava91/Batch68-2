package com.languagefundamentals.methods;

import java.util.Scanner;

//3) with return type + no arguments.
public class TestMethodsDemo5 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestMethodsDemo5 t = new TestMethodsDemo5();

		double sal = t.getSalaryInfo();
		double bonus = t.getBonusInfo();

		System.out.println("Total Salary = " + (sal + bonus));
		System.out.println("main method ended");
	}

	double getSalaryInfo() {
		System.out.println("Enter your Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	double getBonusInfo() {
		System.out.println("Enter bonus info : ");
		double bonus = sc.nextDouble();
		return bonus;
	}

}
