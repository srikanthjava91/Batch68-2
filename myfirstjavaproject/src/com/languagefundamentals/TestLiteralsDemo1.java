package com.languagefundamentals;

public class TestLiteralsDemo1 {

	public static void main(String[] args) {

		// -128 to 127 --> create a single object
		Integer i = 100;
		Integer i3 = 100;
		System.out.println(i == i3);

		// 127 above creating everytime new object
		Integer i1 = 200;
		Integer i2 = 200;
		System.out.println(i1 == i2);

//		ArrayList<Integer>al = new ArrayList<>();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		
//		for(int i : al) {
//			System.out.println(i);
//		}

//		System.out.println(al);

//		int a;
		// The local variable a may not have been initialized
//		System.out.println(a);

		int a1 = 100;
		int a2 = 789;
		int a3 = 654;

		// Octal Literals : starts with 0 and base is 8 (0 to 7)-->
		int a4 = 0567;
//		5*8^2 +6*8^1 +7*8^0  = 320 + 48 + 7 = 375
		int a5 = 05674;
		// The literal 0349 of type int is out of range
//		int a6 = 0349;

		// Hexa Literals : statrs with 0x or 0X base is 16(0 to 9 & a-f/A-F)
		// a=10 b=11 c=12 d=13 e=14 f=15
		int a6 = 0x234;

//		2*16^2 +3*16^1 +4*16^0 = 564
		int a7 = 0X249;
		int a8 = 0Xabc;
		int a9 = 0xBEE;
//		int a10 = 0xbeer;//Syntax error on token "r", delete this token

		int a11 = 0b0101;
		// 0*2^3 + 1*2^2 +0*2^1 +1*2^0 = 5

		System.out.println(a1);// 100
		System.out.println(a2);// 789
		System.out.println(a3);// 654
		System.out.println(a4);
		System.out.println(a5);
		System.out.println("*******hexaDecimal values ");
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a11);

	}

}
