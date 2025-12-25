package com.javaintro;

public class TestDemo8 {

	native void welcome();

	void hello() {
		System.out.println("hello method called ");
	}

	void main(String[] args) {
		System.out.println("main method called ");
		hello();
		hello();
		hello();
		hello();
		hello();
//		welcome();
	}
}
