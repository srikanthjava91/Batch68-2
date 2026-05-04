package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		try {
			System.out.println("in try !!");
//			System.out.println(10.0/ 0);//Infinity
//			System.out.println(0 / 0);//java.lang.ArithmeticException:
//			System.out.println(0 / 5);//0
//			System.out.println(0.0 / 0.0);//NaN
			System.out.println(100 / 0);// AE

		} catch (ArithmeticException e) {
			System.err.println("in catch !!");
//			e.printStackTrace();//Name, Description & Location
//			System.err.println(e.getMessage());//Description
//			System.err.println(e.toString());//Name & Description 
		}

		System.out.println("main method ended ");
	}

}
