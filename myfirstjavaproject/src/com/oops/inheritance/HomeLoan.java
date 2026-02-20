package com.oops.inheritance;

import java.io.IOException;

public class HomeLoan extends LoanImpl {

//	Whenever we are not happy with the Parent class functionalities, 
//	then go and create same method with same signature in child class with different behavior 
//	is the concept called method overriding.

//	Method Overriding rules: 

//	1) Method signature must be same.
//	Note : Method signature included only method name + arguments but not return type.

//	2) Method return type must be same.
//	Note : This rule is applicable up to Java 1.5 version only, 
//	Later Java can use Co-varient return types.
//	Even though after 1.5 version 
//	- if the Parent class method return type is primitive the child class must return same primitive. 
//	- if the Parent class method return type is Object type then child class can use Co-varient return types.

//	Co-varient return types: 
//	If the Parent class method return any Object type, the child class can return same Object or 
//	it's sub type is the concept called Co-varient return type.

//	ex: If the Parent class is Number --> Integer, Short, Long ...
//	    If the Parent class is String --> String 
//	    If the Parent class is Object --> String, Object, Integer, ......

//	3) Method scope should not reduced. : public > protected > default > private 
//	  If the Parent method access modifier is  public --> then child must be public.
//	  If P --> protected -------  C --> protected or public 
//	  If P --> default  --------- C --> default or protected or public 
//	  If P --> private  --------  C --> cannot override.

//	4) If the Parent method is private, we cannot override it in child class, 
//	because the scope of private is within the class.
//	Note : If we have private method in parent class, 
//	the same method we can write it in child class with private access modifier 
//	will not be a error or any problem until we use @Override annotation 

//	5) If the method is static we cannot override. 
//	But we can consider this as Method hiding.

//	6) If the method is final, we cannot override.
//	CE : Cannot override the final method from Loan

//	final keyword if we keep for methods, we cannot override because to provide original Behavior from parent class specifications.
//	But final methods, we can call from different packages if the method i public.

//	Note :If the class is final, all methods inside that class are also final.
//	But, if the class if final, all variables inside that class are not final.

//	7) If Parent class method throws any Exceptions then the child class no need to throws the same or any Exception.
//	But, the child class override method throws any exception, the parent class must throws the same Exception or it's Parent Exception.

//	8) 
//	a) If the Parent class is abstract and method is also abstract, 
//	the child class must override that method with implementation.

//	b) If the Parent class is normal class and we have normal method. 
//	the child class is abstract, So can we override normal method as abstract ..? Yes 

	@Override
	public double getROI() {
		return 8.0;
	}

	@Override
	public String hello(String str) {
		return str;
	}

	@Override
	public Integer getUserAge() {
		return 20;
	}

	public static void main(String[] args) throws Exception {

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
		Loan l = new LoanImpl();

		// By using Child Object, Child reference we can access both Parent and child
		// class methods directly
		HomeLoan hl = new HomeLoan();

		double salary = hl.getUserSalaryInfo();
		int cibil = hl.getUserCibilScore();
		Number age = hl.getUserAge();

		if (salary >= 600000.00 && cibil >= 720 && hl.validateAadher() && hl.ValidatePan() && hl.validatePhone()) {
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
