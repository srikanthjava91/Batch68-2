package com.oops.inheritance;

import java.util.Scanner;

//Super class or Base class or Parent 
public class LoanImpl implements Loan {
	static Scanner sc = new Scanner(System.in);

	public boolean validateAadher() {
		System.out.println("Enter your Aadhar Number: ");
		String aadhar = sc.next();

		if (aadhar.matches("^[2-9][0-9]{11}$")) {
			System.out.println("✅ Valid Aadhar Number");
			return true;
		} else {
			System.out.println("❌ Invalid Aadhar Number (Must be 12 digits)");
			return false;
		}
	}

	public boolean ValidatePan() {

		System.out.println("Enter your PAN Number: ");
		String aadhar = sc.next();

		if (aadhar.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$")) {
			System.out.println("✅ Valid PAN Number");
			return true;
		} else {
			System.out.println("❌ Invalid PAN Number (Must be like an Example :ABCDE1234F)");
			return false;
		}

	}

	public boolean validatePhone() {

		System.out.println("Enter your Phone Number: ");
		String phone = sc.next();

		if (phone.matches("^[6-9][0-9]{9}$")) {
			System.out.println("✅ Valid phone Number");
			return true;
		} else {
			System.out.println("❌ Invalid phone Number (Must be 10 digits)");
			return false;
		}

	}

	public double getUserSalaryInfo() {
		System.out.println("Enter your salary info : ");
		double sal = sc.nextDouble();
		return sal;
	}

	public int getUserCibilScore() {
		System.out.println("Enter Your cibil score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	public Number getUserAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	public double getROI() {
		double roi = 9.5;
		return roi;
	}

	public String hello(String s) {
		return "Hello ";
	}

	public String getAddressDetails() {
		String address = "";

		System.out.println("Enter your flat no : ");
		sc.nextLine();
		String flatno = sc.nextLine();

		System.out.println("Enter plot details: ");
		String plot = sc.nextLine();

		System.out.println("Enter Apartment name  ");
		String aptName = sc.nextLine();

		System.out.println("Enter your street : ");
		String street = sc.nextLine();

		System.out.println("Enter pinocde :");
		long pin = sc.nextLong();

		address = "Flat No : " + flatno + " " + "Plot Details : " + plot + " " + "Street Name : " + street + " "
				+ "apartment name : " + aptName + " " + "pincode : " + pin;

		return address;

	}

}
