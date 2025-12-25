package com.javaintro;

public class Employee {

	int eid;
	String empName;

	static String orgName;

	void main(String[] args) {

		System.out.println("main method strated ");
		System.out.println(orgName);

		Employee e1 = new Employee();
		e1.orgName = "Vcube";
		e1.eid = 10;
		e1.empName = "Vinay";

		System.out.println(e1.eid);
		System.out.println(e1.empName);
		System.out.println(orgName);

		System.out.println("2nd object");
		Employee e2 = new Employee();
		e2.orgName = "VSS";
		System.out.println(e2.eid);
		System.out.println(e2.empName);
		System.out.println(orgName);

		Employee e3 = new Employee();
		System.out.println(e3.eid);
		System.out.println(e3.empName);
		System.out.println(orgName);

		System.out.println("**************");
		Employee e4 = null;
		e4.orgName = "SSS";
		e4.eid = 111;
		System.out.println(e4.orgName);
		System.out.println(e4.eid);// NPE : NullpointerException

	}
}
