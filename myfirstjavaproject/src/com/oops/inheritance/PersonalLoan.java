package com.oops.inheritance;

import java.util.Scanner;


//Sub class or Derived class or child class 
public class PersonalLoan extends Loan {
	static Scanner sc = new Scanner(System.in);

	void getPersonalLoanDocInfo() {
		System.out.println("Successfully submitted all documents : ");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Loans !!");
		System.out.println("Welcome to Personal Loan Banking");

		// By using Child Object Child reference we can access both Parent and child
		// class methods directly
		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getUserSalaryInfo();
		int cibil = pl.getUserCibilScore();
		int age = pl.getUserAge();

		if (salary >= 800000.00 && cibil >= 750 && age >= 26 && pl.validateAadher() && pl.ValidatePan()
				&& pl.validatePhone()) {
			System.out.println("Congratulations !! You are eligible for Personal Loan !");
			System.out.println("Your Personal Loan ROI is : " + pl.getROI());
			System.out.println("Address details : ");
			String address = pl.getAddressDetails();

			pl.getPersonalLoanDocInfo();

			System.out.println("Entered address is : " + address);
		} else {
			System.out.println("You are not eligible for Personal Loan !! Better luck Next time : !");
		}
	}
}
