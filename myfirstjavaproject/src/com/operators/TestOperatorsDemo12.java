package com.operators;

class TestA {

}

class TestB extends TestA {

}

public class TestOperatorsDemo12 {

	public static void main(String[] args) {
		System.out.println("mian method started ");

		TestB b = new TestB();
		System.out.println(b instanceof TestB);
		System.out.println(b instanceof TestA);

		TestA a = new TestA();
		System.out.println(a instanceof TestA);
		System.out.println(a instanceof TestB);//false

	}

}
