package com.languagefundamentals.methods;

//1) No return type + no arguments 
public class TestMethodsDemo1 {

	void hello() {
		System.out.println("Hello Guys, Good evening !!");
	}

	// main method called by the JVM
	public static void main(String[] args) {
		System.out.println("main method started !!");

		// Object creation
		TestMethodsDemo1 t = new TestMethodsDemo1();

		// calling the method
		TestMethodsDemo1.welcome();

		// instance methods we must need to call by using object reference variable in
		// static area.
		t.hello();

		System.out.println("main method ended !");
	}

	public static void welcome() {
		System.out.println("Welcome to Vcube !");
	}
}
