package com.oops.inheritance;

abstract class A {

	static int a = 10;

	abstract void method1();

	public static void main(String[] args) {
		a = 200;
		System.out.println(a);

	}
}

class B extends A {

	public static void main(String[] args) {

	}

	@Override
	void method1() {
		System.out.println("Hello mr. Sajan ");
	}

}

abstract class C extends B {

	@Override
	abstract void method1();

}

public final class TestDemo1 {

//	final Integer a = 10;
//
//	public TestDemo1(Integer a) {
//		this.a = a;
//	}

	public static void main(String[] args) {
		System.out.println("main method started ");
//		a = 200;
//		System.out.println(a);

//		TestDemo1 t1 = new TestDemo1(10);

	}

}
