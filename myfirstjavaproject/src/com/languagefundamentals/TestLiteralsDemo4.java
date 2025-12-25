package com.languagefundamentals;

public class TestLiteralsDemo4 {

	public static void main(String[] args) {

		String s1 = "Srikanth";// String Literal --> SCP --> Heap --> 1 object
		System.out.println(s1);// Srikanth

		String s2 = "Srikanth";// String Literal --> 0 objects
		System.out.println(s1 == s2);//true == operator always checks the references of the object
		System.out.println(s1.equals(s2));//true
		
		String s3 = new String("Java");// 2 objects
		String s4 = new String("Java");// 1 object
		System.out.println(s3 == s4);//false
		System.out.println(s3.equals(s4));//true

		// Type mismatch: cannot convert from String to StringBuffer
//		StringBuffer sb ="Java";
//		System.out.println(sb);//

	}

}
