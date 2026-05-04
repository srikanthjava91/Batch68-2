package com.collectionsframeworks.set;

public class Employee {

	int eid;
	String ename;
	int age;
	double salary;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", salary=" + salary + "]";
	}

	public Employee(int eid, String ename, int age, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}

}
