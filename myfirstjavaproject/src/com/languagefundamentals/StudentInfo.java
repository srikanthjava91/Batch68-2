package com.languagefundamentals;

public class StudentInfo {

	// instance data
	// primitive + instance
	int studentId = 101;

	// Object + instance
	String studentName = "Srikanth";

	// static data
	// primitive + static
	static int collegId = 555;

	// Object + static
	static String collegeName = "Vcube Software Solutions";

	public static void main(String[] args) {
		System.out.println("main method started !");

		StudentInfo s1 = new StudentInfo();

		// static data, we can access directly in a same class
		System.out.println(collegId);
		System.out.println(collegeName);

		System.out.println("**********************");
		// If we want to access static data in a different class or in a same class we
		// can also access through class name
		System.out.println(StudentInfo.collegId);
		System.out.println(StudentInfo.collegeName);

//		Whenever we want to access instance data in static area, 
//		we must need to create an object and we can access through Object reference variable
		System.out.println(s1.studentId);
		System.out.println(s1.studentName);

//		we cannot access instance data using class name !!
//		but, we can access static data by using object reference variable.
//		System.out.println(StudentInfo.studentId);

//		Accessing static data using object reference variable is not recommended, our code 
//		always Error free and Warning free.
//		Firstly, We will get a warning from compiler like below : 
//		Warning : The static field StudentInfo.collegId should be accessed in a static way
		System.out.println("***********");
		System.out.println(s1.collegId);
		System.out.println(s1.collegeName);
		
		StudentInfo s2 = null;
//		System.out.println(s2.studentId);//null dot anything is NPE : NullPointerException
		System.out.println(s2.collegId);//555

	}

}
