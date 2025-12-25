package com.javaintro;

public class Mobile {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !");
	}

	void hello() {
		System.out.println("Hello");

		// Object created inside a method
		Mobile m1 = new Mobile();
	}

	void main(String[] args) {

		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();

		// 1) Nullify the objects
		m1 = null;

		// 2) Re-assigning the object
		m2 = m3;

		// 3) Anonymous object
		new Mobile();

		// 4) object created inside a method
		hello();

		// Runs the garbage collector in the Java Virtual Machine.
//		System.gc();
//		Runtime.getRuntime().gc();

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

	}

}
