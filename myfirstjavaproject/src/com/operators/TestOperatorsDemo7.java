package com.operators;

public class TestOperatorsDemo7 {

	public static void main(String[] args) {

		System.out.println("********************");
		System.out.println(25 & 3);
		System.out.println(61 & 7);
		System.out.println(84 & 21);// 20
		System.out.println(72 & 36);// 0

		System.out.println("********************");
		System.out.println(25 | 3);//
		System.out.println(61 | 7);
		System.out.println(84 | 21);
		System.out.println(72 | 36);

		System.out.println("********************");
		System.out.println(25 ^ 3);
		System.out.println(61 ^ 7);// 58
		System.out.println(84 ^ 21);
		System.out.println(72 ^ 36);

		System.out.println("*****************");
		System.out.println(~56);
//		System.out.println(-(n+1));

	}

}
