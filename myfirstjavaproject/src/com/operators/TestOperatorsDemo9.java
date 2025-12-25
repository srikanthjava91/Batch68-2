package com.operators;

public class TestOperatorsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method satrted !");

		int max = 0;
		int a = 100;
		int b = 200;
		max = (a > b) ? a : b;
		System.out.println("max value from a given Values : " + max);

		int x = 10;
		int y = 20;
		int z = 30;
		int max1 = 0;

		max1 = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("Max1 value from a given value s: " + max1);

	}

}
