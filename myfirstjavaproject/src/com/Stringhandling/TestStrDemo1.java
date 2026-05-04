package com.Stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {

		// String Literals --> SCP : String Constant Pool
		String s1 = "Java";// only one object

		// String Literals --> SCP : String Constant Pool
		String s2 = "Srikanth";// only one object

		// 0 objects creating
		String s3 = "Java";

		System.out.println(s1 == s3);// true
		System.out.println("************");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));

		// 2 objects creating = 1 in in scp + 1 is in heap area
		String s4 = new String("Veera");

		// 0 objects in SCP
		String s5 = "Veera";
		System.out.println(s4 == s5);

		// 1 object created only in heap area
		String s6 = new String("Veera");
		System.out.println(s4 == s6);

		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s6));
		System.out.println(s6.hashCode());
		System.out.println(s4.hashCode());

	}

}
