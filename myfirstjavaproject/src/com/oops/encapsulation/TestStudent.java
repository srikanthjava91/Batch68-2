package com.oops.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		We cannot Access directly the data outside of the classes if the data is private. 
		Student s1 = new Student();

		// modifying the data
		s1.setSid("1");
		s1.setSname("Srikanth");
		s1.setAge(16);
		
		//Reading the data 
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getAge());

//		s1.sid = 1;
//		s1.sname = "Veera";
//		s1.age = 21;
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.age);

	}

}
