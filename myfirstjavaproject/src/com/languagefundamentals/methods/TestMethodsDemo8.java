package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMethodsDemo8 {

	char sum() {
		int a = 40 + 25;
		return (char) a;
	}

	int add() {
		return 'A' + 'B';
	}

	String getName(String s1, String s2) {
		return s1 + s2;
	}

	byte addition(byte a, byte b) {
		byte sum = (byte) (a + b);
		return sum;
	}

	double subtraction(int a, int b) {
		float diff = b - a;
		return diff;
	}

	float multiplication(double d1, double d2) {
		double product = d1 * d2;
		return (float) product;
	}

	void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println(sum());
		System.out.println(add());
		sc.close();
	}
}
