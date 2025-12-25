package com.languagefundamentals;

class Student {

}

public class TestDataTypesDemo2 {

	public static void main(String[] args) {

		// Decimal
		int a = 123;
		int a1 = 0123; // Octal - 8 --> 0 to 7
//		int a2 = 0567;/
		// 1*8^2 +2*8^1 +3*8^0 =64 + 16 + 3 = 83

		int a2 = 0xabc;// Hexa Decimal --> 0 to 9 & A-F or a-f
		// 1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291

		// Binary (base 2) --> prefix with 0b or 0B
		int a3 = 0b1010; // 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8 + 0 + 2 + 0 = 10

		System.out.println(a);// 123
		System.out.println(a1);// 83
		System.out.println(a2);// 291
		System.out.println(a3);

	}

}
