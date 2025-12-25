package com.languagefundamentals;

public class Employee1 {

	int empId;
	double empSal;

	static String orgName = "vcube";
	static int orgId = 123;

	public static void main(String[] args) {

		var id = 101;
		var name = "Srikanth";

		System.out.println(id);
		System.out.println(name);

		int a;
//		CE :  The local variable a may not have been initialized
//		System.out.println(a);

		// Local Variables
		// primitive + local
		int orgId = 666;

		// Object + primitive
		String orgName = "VSS";

		// Illegal modifier for parameter name; only final is permitted
		String name1 = "Yashwanth";

		Employee1 e1 = new Employee1();
		System.out.println(e1.empId);// 0
		System.out.println(e1.empSal);// 0.0

		System.out.println(orgName);// vcube
		System.out.println(orgId);// 123

		System.out.println(Employee1.orgId);
		System.out.println(Employee1.orgName);

	}

}
