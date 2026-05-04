package com.oops.abstracion;

public abstract class TestAbs implements TestIn1 {

	int a = 10;
	static String name = "Vcube";

	TestAbs() {
		System.out.println("TestAbs constructor called !");
	}

	// abstract methods
	abstract void method6();

	// Concrete or normal method
	 void method7() {
		System.out.println("method7 called !");
	}

	// override methods from interface
	@Override
	public void method1() {

	}

	@Override
	public void method2() {

	}

	@Override
	public void method3() {

	}

	@Override
	public void method4() {

	}

	@Override
	public void method5() {

	}

}
