package com.Stringhandling;

import java.util.Scanner;

public class ValidationProgram {

	// Aadhaar validation (12 digits)
	public static boolean isValidAadhaar(String aadhaar) {
		return aadhaar.matches("[2-9]{1}\\d{11}");
	}

	// Phone validation (10 digits starting with 6-9)
	public static boolean isValidPhone(String phone) {
		return phone.matches("[6-9]\\d{9}");
	}

	// PAN validation (ABCDE1234F format)
	public static boolean isValidPAN(String pan) {
		return pan.matches("[A-Z]{5}\\d{4}[A-Z]");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String atr = "Srikanth";
		System.out.println(atr.length());

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(arr.length);

		System.out.print("Enter Aadhaar Number: ");
		String aadhaar = sc.nextLine();

		System.out.print("Enter Phone Number: ");
		String phone = sc.nextLine();

		System.out.print("Enter PAN Number: ");
		String pan = sc.nextLine();

		// Validation Results
		if (isValidAadhaar(aadhaar)) {
			System.out.println("Valid Aadhaar Number");
		} else {
			System.out.println("Invalid Aadhaar Number");
		}

		if (isValidPhone(phone)) {
			System.out.println("Valid Phone Number");
		} else {
			System.out.println("Invalid Phone Number");
		}

		if (isValidPAN(pan)) {
			System.out.println("Valid PAN Number");
		} else {
			System.out.println("Invalid PAN Number");
		}

		sc.close();
	}
}