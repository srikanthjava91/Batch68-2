package com.javaintro;

public class TestDemo6 {

	static TestDemo6 t = new TestDemo6();
	static int a;
	int b = 10;

	// static block
	static {
		a = 25;
		int c = 10;
		System.out.println(a);
		System.out.println("static block1 called ");
	}

	// main method
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println("main method started ");
//		System.out.println(c);
	}

	// instance block
	{
		System.out.println("instance block called ");
	}

}
