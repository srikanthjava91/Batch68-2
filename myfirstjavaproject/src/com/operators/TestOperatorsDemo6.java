package com.operators;

//All Relational Operation will give the resulted values as Boolean.
//Logical OPerators --> && || !
public class TestOperatorsDemo6 {

	public static void main(String[] args) {

		int a = 100;
		int b = 150;
		int c = 200;
		int d = 150;

		System.out.println("********&&*****************");
		System.out.println(false && false); // --> false
		System.out.println(a > b && a > c && b == d);

		System.out.println(false && true);// false
		System.out.println(a > b && c > a);// false

		System.out.println(true && true);// true
		System.out.println(c > a && a < c);// true

		System.out.println(true && false); // false
		System.out.println(c > a && a > c);// false

		System.out.println("****************|| **********");
		System.out.println(true || true);// true
		System.out.println(a > b || b > a || b == d);
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		System.out.println("*****************************");
		System.out.println(b != d);// false
		System.out.println(!(b == d));// false

		System.out.println("*************************");

		System.out.println(a < b);// true
		System.out.println(a < c);// true
		System.out.println(b < a);// false
		System.out.println(b < c);// true
		System.out.println(c < a);// false
		System.out.println(c < b);// false

		System.out.println("******************");
		System.out.println(b == d);
		System.out.println(b != d);
		System.out.println("******************");

		System.out.println(a >= d);// false
		System.out.println(b >= d);// true
		System.out.println(b <= d);// true

	}

}
