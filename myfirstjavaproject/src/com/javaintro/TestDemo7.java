package com.javaintro;

public class TestDemo7 {

	// instance main method
	void main(String[] args) {
		System.out.println("main method started !");
		addition();
		subtraction();
	}

	// For local variables, JVM will not initialize the default values.
	// CE : The local variable x may not have been initialized
	void subtraction() {
		System.out.println("sub called ");
//		int x ;
		int x = 100;
		int y = 50;
		System.out.println(x - y);
	}

	void addition() {
		System.out.println("add called ");
		int a = 10;
		int b = 10;
		System.out.println(a + b);
	}

}
