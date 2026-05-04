package com.Stringhandling;

class Student {
	int id = 1;
	String name = "Srikanth";
	
	@Override
	public String toString() {
		return "Student : SID =" + id +" Name : " + name ;
	}

}

public class TestStrDemo20 {

	public static void main(String[] args) {

		TestStrDemo20 t = new TestStrDemo20();
		System.out.println(t);// Address of the Object
		System.out.println(t.toString());
		
		Student s = new Student();
		System.out.println(s);
		
		String s1 = new String("Sri");
		System.out.println(s1);
		System.out.println(s1.toString());
		
		System.out.println("main method ended");

	}

}
