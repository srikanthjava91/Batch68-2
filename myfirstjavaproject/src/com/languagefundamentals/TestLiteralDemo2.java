package com.languagefundamentals;

//Floating Literals 
//byte --> short -->  int -->  long -->  float -->  double : Implicit Type casting 
//char boolean 
public class TestLiteralDemo2 {

	public static void main(String[] args) {

		float f1 = 100;
		float f2 = 123;
		float f3 = 0123;
		float f4 = 1230;
		float f5 = 0123.5F;//
//		float f6 = 0123.5;//Type mismatch: cannot convert from double to float
		float f7 = (float) 123.5;// Type mismatch: cannot convert from double to float
		// we did explicit type casting with float
		float f8 = 123.5f;
//		float f9 = 1230.5;//CE
		float f10 = 0x123;
		float f11 = 0xabc;
		float f12 = 123F;
		float f13 = 0123F;
		float f14 = 0x123f;// Hexa Decimal number
//		float f15 = 0x123.5F;//Invalid hex literal number

		
		double d1 = 123D;
		System.out.println(d1);
		
		System.out.println("******************");
		System.out.println(f1);// 100.0
		System.out.println(f2);// 123.0
		System.out.println(f3);// 83.0
		System.out.println(f4);// 1230.0
		System.out.println(f5);// 123.5
		System.out.println(f7);
		System.out.println(f8);
		System.out.println(f10);//
		System.out.println(f11);
		System.out.println(f12);
		System.out.println(f13);
		System.out.println(f14);

	}

}
