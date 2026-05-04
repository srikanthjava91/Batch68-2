package com.oops.abstracion;

interface In1 {

	void method1();

	void method2();

	default void method4() {
		System.out.println("method4 called ");
	}

	static void method5() {

	}

}

interface In2 {

	void method2();

	void method3();

	static void method5() {

	}

//	default void method4() {
//		System.out.println("method4 called ");
//	}

}

interface In3 extends In2, In1 {

}

class TestIn3 implements In3 {

	@Override
	public void method1() {
		System.out.println("Method1 called ");

	}

	@Override
	public void method2() {
		System.out.println("Method2 called ");

	}

	@Override
	public void method3() {
		System.out.println("Method3 called ");

	}

}

public class TestAbstarctionDemo1 {

	public static void main(String[] args) {

		In3 i3 = new TestIn3();
		i3.method1();
		i3.method2();
		i3.method3();

	}

}
