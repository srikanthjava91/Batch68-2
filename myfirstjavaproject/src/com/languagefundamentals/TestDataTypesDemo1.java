package com.languagefundamentals;

//Note : By default RHS numbers are integer values.
//Note : By default RHS decimal point numbers are double.

//byte - short - int - long - float - double 
public class TestDataTypesDemo1 {

	byte b = 100;
//	byte b1 = 128;//CE : Type mismatch: cannot convert from int to byte
	byte b2 = (byte) 257;// Type casting : Explicit Type casting - int to byte

	short s = 12345;
//	short s1 = 32768;//Type mismatch: cannot convert from int to short
	short s2 = (short) 32768;
	// Type casting : Explicit Type casting - int to short

	int i = 2147483647;// 2^31
//	int i1 = 2147483648;//The literal 2147483648 of type int is out of range 
	int i2 = (int) 2147483648L;
	//// Type casting : Explicit Type casting - long to int

	long l = 9223372036854775807L;// 2^63
	long l1 = 2147483648L;
	long l2 = 9223372036854775807L;

//	float f = 5.9;//Type mismatch: cannot convert from double to float
	float f = 5.9f;//
	float f1 = 100;// Implicit Type Casting (int --> float )
	float f2 = 45.6789976554579F;
	double d = 45.6789976554579D;
	float f3 = 214748364786766564547F;

	char c = 'M';
	char c1 = 'F';
	char c3 = '5';

	// ASCII code A-Z (65 to 90)
	// a-z(97 to 122)
	char c2 = 33;// int --> char

	// Unicode
	char c4 = '\u0023';
	int i5 = 'A';// char --> int

	boolean boo = false;

	// all are invalid, boolean can accept only true or false
//	boolean b6=0;
//	boolean b3=1;
//	boolean b4=True;
//	boolean b5=False;
//	boolean boo = "false";
//	boolean boo = "true";

	public static void main(String[] args) {
		System.out.println("main method started !");
		TestDataTypesDemo1 t = new TestDataTypesDemo1();
		System.out.println("byte value :" + t.b);// 0
		System.out.println("byte value :" + t.b2);// 0

		System.out.println("short value :" + t.s);// 0

		System.out.println("int value :" + t.i);// 0
		System.out.println("int5 value :" + t.i5);// 0

		System.out.println("long value :" + t.l);// 0

		System.out.println("float value :" + t.f);// 0.0
		System.out.println("float value :" + t.f1);// 0.0

		System.out.println("float value :" + t.f2);// 0.0
		System.out.println("double value :" + t.d);// 0.0

		System.out.println("float3 value :" + t.f3);// 0.0
		System.out.println("char value : " + t.c);//
		System.out.println("char value : " + t.c1);//
		System.out.println("char2 value : " + t.c2);//
		System.out.println("char3 value : " + t.c3);//
		System.out.println("char4 value : " + t.c4);//

		System.out.println("boolean value : " + t.boo);// false

		if (t.boo) {
			System.out.println("Hello Guys, Good Morning !!");
		}

	}
}
