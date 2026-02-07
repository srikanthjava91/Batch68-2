package com.oops.shallowdeep;

class Employee {
	String name;
	Address1 address1;

	public Employee(String name, Address1 address1) {
		this.name = name;
		this.address1 = address1;
	}

	public Employee(Employee e) {
		this.name = e.name;
		this.address1 = new Address1(e.address1);
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		this.city = city;
	}

	public Address1(Address1 address1) {
		this.city = address1.city;
	}

}

public class TestDeepCopyDemo1 {

	public static void main(String[] args) {

		Address1 ad1 = new Address1("Nellore");
		Employee emp1 = new Employee("Srikanth", ad1);
		System.out.println(emp1.name);
		System.out.println(emp1.address1.city);

		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.name);
		System.out.println(emp2.address1.city);

		System.out.println("*****************");
		emp2.name = "Veera";
		emp2.address1.city = "Hyderabad";

		System.out.println(emp1.name);
		System.out.println(emp1.address1.city);
		System.out.println(emp2.name);
		System.out.println(emp2.address1.city);

	}

}
