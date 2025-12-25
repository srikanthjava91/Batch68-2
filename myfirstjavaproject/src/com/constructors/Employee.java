package com.constructors;

public class Employee {

	int eid;
	double esal;
	String ename;
	int eage;

//	While creating an object, if we want to pass any values to the object instance data 
//	then we need parameterized constructor.

	Employee(int eid, String ename) {
		System.out.println("2-parameterized constructor called ");
		this.eid = eid;
		this.ename = ename;
	}

	public Employee(int eid, double esal, String ename, int eage) {
		System.out.println("4-parameterized constructor called ");
		this.eid = eid;
		this.esal = esal;
		this.ename = ename;
		this.eage = eage;
	}

	Employee() {
		System.out.println("no arg constructor called !!");
		eid = 100;
		esal = 1000.00;
		ename = "unknown";
		eage = 18;
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");
		
//		Student s1 = new Student();

//		Employee e1 = new Employee();
//		e1.show();
//
//		Employee e2 = new Employee(1, 500000.00, "Pradeep", 22);
//		e2.show();
//
//		Employee e3 = new Employee(2, "Srikanth");
//		e3.show();

		System.out.println("mian method ended !");
	}

	void show() {
		System.out.println("EID : " + eid);
		System.out.println("Esal : " + esal);
		System.out.println("E Name : " + ename);
		System.out.println("E Age: " + eage);
		System.out.println("***************");
	}
}
