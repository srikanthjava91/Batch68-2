package com.java8features01;

class TestA {
	void taste() {
		System.out.println("Biriyani is too spicy ");
	}
}

public class TestJ8Demo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestA a = new TestA() {
			@Override
			void taste() {
				System.out.println("Biriyani is very tasty without spice ! ");
			}
		};

		a.taste();
	}

}
