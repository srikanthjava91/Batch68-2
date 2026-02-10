package com.oops.inheritance;

public class HomeLoan extends Loan {

//	Whenever we are not happy with the Parent class functionalities, 
//	then go and create same method with same signature in child class with different behavior 
//	is the concept called method overriding.
	@Override
	public double getROI() {
		return 8.0;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube Loans !!");
		System.out.println("Welcome to Home Loan Banking");

//		Can we store Parent Object into Child reference..? 
//		By using parent Object, Child reference we can call 
//		Type mismatch: cannot convert from Loan to PersonalLoan
//		HomeLoan pl1 = new Loan();

//		Exception in thread "main" java.lang.ClassCastException: 
//		class com.oops.inheritance.Loan cannot be cast to class com.oops.inheritance.HomeLoan 
//		HomeLoan hl1 = (HomeLoan) new Loan();
//		hl1.getROI();
//		hl1.getHomeLoanDocInfo();

		// Can we store Child Object into Parent reference ..? Yes
		// By using Child Object, Parent reference we can call only Parent class
		// functionalities only.
		Loan l1 = new HomeLoan();// Up-casting --> abstraction
		System.out.println(l1.getROI());// Dynamic Method Dispatching
//		Whenever the method is overriding from Parent to child, 
//		if we call override method by using Parent reference, it will execute child override method.

		// By using Parent Object, Parent reference we can call only Parent class
		// functionalities.
		Loan l = new Loan();

		// By using Child Object, Child reference we can access both Parent and child
		// class methods directly
		HomeLoan hl = new HomeLoan();

		double salary = hl.getUserSalaryInfo();
		int cibil = hl.getUserCibilScore();
		int age = hl.getUserAge();

		if (salary >= 600000.00 && cibil >= 720 && age >= 25 && hl.validateAadher() && hl.ValidatePan()
				&& hl.validatePhone()) {
			System.out.println("Congratulations !! You are eligible for Home Loan !");
			System.out.println("Your Personal Loan ROI is : " + hl.getROI());
			System.out.println("Address details : ");
			String address = hl.getAddressDetails();

			hl.getHomeLoanDocInfo();

			System.out.println("Entered address is : " + address);
		} else {
			System.out.println("You are not eligible for Home Loan !! Better luck Next time : !");
		}

	}

	private void getHomeLoanDocInfo() {
		System.out.println("Home loan dcouments SUbmitted !!");

	}

}
