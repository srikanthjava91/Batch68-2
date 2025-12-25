package com.javaintro;

public class TestDemo3 {
	
	int a = 10;

	void hello() {
		System.out.println("Hello Good evening !");
		System.out.println("Hello Good evening !");
		System.out.println("Hello Good evening !");
		System.out.println("****" + Thread.currentThread().getName());
	}

	 void main(String[] args) {

		System.out.println("Hello main method started ");
		System.out.println("Hello main method ");
		System.out.println("Hello main method ");
		// calling a method
		welcome();
		hello();

		System.out.println("****" + Thread.currentThread().getName());

		System.out.println("main method ended !!");
	}

	public static void welcome() {
		System.out.println("Welcome to JVM Architecture !");
		System.out.println("Welcome to JVM Architecture !");
		System.out.println("Welcome to JVM Architecture !");
		System.out.println("****" + Thread.currentThread().getName());
	}

}
