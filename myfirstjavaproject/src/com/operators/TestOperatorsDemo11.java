package com.operators;

public class TestOperatorsDemo11 {

	public static void main(String[] args) {
		System.out.println("main method strated !");

		Integer i = 10;
		System.out.println(i instanceof Integer);// true
		System.out.println(i instanceof Number);// true
		System.out.println(i instanceof Object);// true

		// Incompatible conditional operand types Integer and String
//		System.out.println(i instanceof String);//
		System.out.println(null instanceof Integer);
		System.out.println(null instanceof Number);
		System.out.println(null instanceof Object);
		
		String s = "Srikanth";
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);

	}

}
