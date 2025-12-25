package com.javaintro;

public class TestDemo5 {

	static void method9() {
		System.out.println("method9 called ");
	}

	// in instance method, Yes we can call instance methods directly
	void method5() {
		method6();
		System.out.println("Hello method5 !");
	}

	void method6() {
		method7();
		System.out.println("Hello method6 !");
	}

	void method7() {
		method8();
		System.out.println("Hello method7 !");
	}

	// in instance, we can call static directly
	void method8() {
		method9();
		System.out.println("Hello method8 !");
	}

	// in static, we can call static methods directly.
	static void method1() {
		method2();
		System.out.println("method1 called ");
	}

	static void method2() {
		method3();
		System.out.println("method2 called ");
	}

	static void method3() {
		method4();
		System.out.println("method3 called ");
	}

	// in static, if we want to call instance data members, we must need to create a
	// object
	static void method4() {
		TestDemo5 t5 = new TestDemo5();
		t5.method5();
		System.out.println("method4 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		TestDemo5 t = new TestDemo5();

		method1();
		System.out.println("main method ended !");
	}
}
