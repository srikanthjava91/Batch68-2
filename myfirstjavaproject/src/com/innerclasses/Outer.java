package com.innerclasses;

public class Outer {
	  
	
	private String msg = "Hello from Outer";

	class Inner {
		void showMessage() {
			System.out.println(msg); // Accessing private member of outer class
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(); // Need outer object to create inner
		inner.showMessage();
	}
}
