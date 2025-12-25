package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog {

}

public class TestDataTypesDemo3 {
	
	
	// Normal Object data types
	String s1 = "Srikanth";// String Literals Object --> SCP --> 1
	String s2 = new String("Vcube");// String Object --> Heap --> 2

	BigInteger bi1 = new BigInteger("214748364721474836471234567890");
	BigInteger bi2 = new BigInteger("214748364721474836471234567890");

	BigDecimal bd1 = new BigDecimal("8756346786978756534378.875465345674589");
	BigDecimal bd2 = new BigDecimal("8756346786978756534378.875465345674589");

	// Wrapper Object data types
	Integer i1 = 10;
	Character c1;
	Boolean b1;
	Dog d;

	public static void main(String[] args) {
		System.out.println("main method started !");
		
		int a = 10;
		int b = 20;
		System.out.println(a +"" + b);


		TestDataTypesDemo3 t = new TestDataTypesDemo3();
//		t.s1 = "Hello";

		System.out.println("String value : " + t.s1);// null
		System.out.println("String value : " + t.s2);// null

		System.out.println("Big Integer value : " + t.bi1);// null
		System.out.println("Big Integer value : " + t.bi2);// null

		System.out.println(t.bi1.add(t.bi2));
		System.out.println(t.bi1.multiply(t.bi2));

		// The operator + is undefined for the argument type(s) java.math.BigInteger,
		// java.math.BigInteger
//		System.out.println(t.bi1 + t.bi2);

		System.out.println("Big Decimal value : " + t.bd1);// null
		System.out.println("Big Decimal value : " + t.bd2);// null
		System.out.println(t.bd1.add(t.bd2));
		
		
		System.out.println("Integer value : " + t.i1);// null
		System.out.println("Character value : " + t.c1);// null
		System.out.println("Boolena value: " + t.b1);// null
		System.out.println("DOg value : " + t.d);// null

		System.out.println("main method ended !");
	}
}
