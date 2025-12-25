package com.languagefundamentals;//2

public class TestIdentifiersDemo1 {// 3

	// instance data
	int student_id = 101;// 4
	String student_name = "Srinu";// 5 //6
	int _age = 22;
	String $money;
//	var name = "Srikanth";
	String var = "srikanth";

	// instance method
	void welcome_1() { // 7
		System.out.println("welcome to lang funda !");// 8 //9 //10
	}

	public static void main(String[] args) throws ClassNotFoundException {// 11 //12

		Class.forName("");

		System.out.println("*****************");
		Integer i = 10;
		System.out.println(null instanceof Number);
		System.out.println("*****************");

		// in methods only we can use var keyword
		var name = "Srikanth";
		var id = 102;
		var gen = 'M';

		// Creating an object
		TestIdentifiersDemo1 t1 = new TestIdentifiersDemo1();// 13

		// Accessing the data
		System.out.println(t1.student_id);
		System.out.println(t1.student_name);

		// calling the method
		t1.welcome_1();
	}
}
