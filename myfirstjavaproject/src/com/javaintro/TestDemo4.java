package com.javaintro;

public class TestDemo4 {

	// instance method
	void hello() {
		System.out.println("Hello ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		TestDemo4 t1 = new TestDemo4();// Creating an object
		welcome();// calling a static method
		t1.hello();// calling a instance method
	}

	// static method
	static void welcome() {
		System.out.println("Welcome to java!!");
	}
}
