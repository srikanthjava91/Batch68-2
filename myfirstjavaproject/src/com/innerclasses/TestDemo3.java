package com.innerclasses;

class Test {
	void method1() {
		System.out.println("method1 called ");
	}
}

interface In1 {
	void show();
}

class TestOuter3 {
	int id = 123;
	String name = "Srikanth";

	public static void main(String[] args) {
		System.out.println("TestOuter3 main method started ");

		// Anonymous Inner class implements In1 interface
		In1 i1 = new In1() {
			@Override
			public void show() {
				System.out.println("SHow method called ");
			}
		};

		i1.show();

		// Anonymous Inner class extends Test class
		Test t = new Test() {
			String name = "Java";

//			@Override
//			void method1() {
//				System.out.println("method1 called from Inner anonymous !!");
//			}

		};

		t.method1();
		System.out.println("TestOuter3 main method ended ");
	}
}

public class TestDemo3 {

	public static void main(String[] args) {

	}

}
