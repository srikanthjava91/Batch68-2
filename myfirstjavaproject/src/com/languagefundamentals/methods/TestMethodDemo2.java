package com.languagefundamentals.methods;

//1) No return type + no arguments 
//WAP to do calculator operations using methods.
//Arithmetic Operators : + - * / %
public class TestMethodDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		// Creating an object
		TestMethodDemo2 t2 = new TestMethodDemo2();

		// calling all the methods
		t2.addition();
		t2.subtraction();
		t2.multiplication();
		t2.division();
		t2.modulus();

		System.out.println("main method ended !");
	}

	void addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("sum of the two numbers :" + c);
	}

	void subtraction() {
		int a = 100;
		int b = 200;
		int c = b - a;
		System.out.println("difference of the two numbers :" + c);
	}

	void multiplication() {
		int x = 10;
		int y = 15;
		int z = x * y;
		System.out.println("product of the two numbers :" + z);
	}

	void division() {
		int m = 100;
		int n = 10;
		int o = m / n;
		System.out.println("quotient of the two numbers :" + o);//100/10 --> 10 --> 0
	}

	void modulus() {
		int k = 99;
		int l = 8;
		int m = k % l;
		System.out.println("reminder of the two numbers :" + m);//99/8 --> 12 --> 3 
	}

}
