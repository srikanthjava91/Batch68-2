package com.constructors;

class TestA {

	TestA() {
		System.out.println("TestA called ");
	}

}

class TestB extends TestA {
	TestB(){
		
		System.out.println("TestB called ");
	}
}

public class TestConDemo {

	public static void main(String[] args) {

		TestB b = new TestB();

	}

}
