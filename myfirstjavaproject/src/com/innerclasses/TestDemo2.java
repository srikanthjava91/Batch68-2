package com.innerclasses;

class TestOuter2 {
	static String name = "Vcube";

	static class TestInner2 {

		void show() {
			System.out.println("Show method called : " + name);
		}
	}

}

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestOuter2.TestInner2 t2 = new TestOuter2.TestInner2();
		t2.show();

		System.out.println("main method ended !!");
	}

}
