package com.oops.inheritance;

//byte --> short --> int --> long --> float --> double 
public class TestMOLDemo2 {

	void main(String[] args) {
		System.out.println("main method started ");
		addition();
		addition(10);
		addition(10L);
		addition(10.5F);
		addition(10.5);

//		addition(10, 20);//The method addition(float, int) is ambiguous for the type TestMOLDemo2

	}

//	void addition(int a, int b) {
//		System.out.println("two int arg method called  ");
//	}

//	void addition(float f, float f1) {
//		System.out.println("two float arg method called ");
//	}

	void addition(float f1, int i1) {
		System.out.println("one float one int arg method called ");
	}

	void addition(int a, float b) {
		System.out.println("one int one float arg method called  ");
	}

	void addition() {
		System.out.println("no arg method called ");
	}

//	void addition(int a) {
//		System.out.println("int one arg method called " + a);
//	}

//	void addition(long a) {
//		System.out.println("long one arg method called " + a);
//	}

	void addition(double a) {
		System.out.println("double one arg method called " + a);
	}
}
