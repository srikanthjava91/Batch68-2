package com.constructors;

public class Student {
	int sid;
	String sname;

	// no arg constructor
	private Student() {
		System.out.println("no arg constructor called !");
		sid = 100;
		sname = "Unknown";
	}

	Student(int sid, String sname) {
		System.out.println("parameterized constructor called !");
		this.sid = sid;
		this.sname = sname;
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");

		// The below Object is created with the help of default constructor.
		// The below Object is create with the help of no arg constructor.
//		Student s1 = new Student();
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);

		Student s2 = new Student(18, "Virat");
		System.out.println(s2.sid);
		System.out.println(s2.sname);

//		Student s3 = new Student();
//		System.out.println(s3.sid);
//		System.out.println(s3.sname);

		System.out.println("main method ended !");
	}
}
