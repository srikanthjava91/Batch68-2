package com.Stringhandling;

public class TestVarArgsDemo1 {

	void main(String[] args) {
		System.out.println("main method strated");
		addition();
		addition(10);
		addition(10, 20);
		addition(10, 20, 30);
		addition(10, 20, 30, 40);
		addition(10, 20, 30, 40, 50);
		addition(10, 20, 30, 40, 50, 60);
		addition(10, 20, 30, 40, 50, 60, 70);

	}

	void addition(int... ar) {
		System.out.println("in addition ");
		int sum = 0;
		for (int a : ar) {
			sum = sum + a;
		}
		System.out.println("addition : " + sum);
	}

}
