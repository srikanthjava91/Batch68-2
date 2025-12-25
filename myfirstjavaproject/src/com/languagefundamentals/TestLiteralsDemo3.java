package com.languagefundamentals;

//Char Literals 
//65=A 97= a
//a
//bb
//ccc
///dddd
public class TestLiteralsDemo3 {

	static String s;

	public static void main(String[] args) {
		
		
		boolean b1 = true;
		boolean b2 = false;
		
		if(b2) {
			System.out.println("Hello Good afternoon !!");
		}

		System.out.println(s);
		TestLiteralsDemo3 t3 = null;

		String s1 = null;
		// The local variable s1 may not have been initialized
		System.out.println(s1);
		System.out.println(t3);
		
		
		t3 = new TestLiteralsDemo3();

		int i1 = 'R';
		int i2 = 'm';
		System.out.println(i1);
		System.out.println(i2);

		char c1 = 'A';// SIngle quote character
		char c2 = 65;// ASCII
		char c3 = '\u0040';// Unicode

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
