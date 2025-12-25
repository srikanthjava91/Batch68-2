package com.languagefundamentals;

class Employee {
	int eid = 1;
	String ename = "Umesh";
	char gender = 'M';
	int age = 21;
	long phone = 9988776655L;
	Address address = new Address();

}

class Address {
	String flatno = "123";
	String plotName = "LIG";
	String street = "KPHB";
	String city = "Hyderabad";
	String state = "TG";
	long pincode = 500072;

}

public class TestDataTypesDemo5 {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		System.out.println(emp1.eid);
		System.out.println(emp1.ename);
		System.out.println(emp1.age);
		System.out.println(emp1.gender);
		System.out.println(emp1.phone);
		System.out.println("*********Address Details : ");
		System.out.println(emp1.address.flatno);
		System.out.println(emp1.address.plotName);
		System.out.println(emp1.address.street);
		System.out.println(emp1.address.state);
		System.out.println(emp1.address.city);
		System.out.println(emp1.address.pincode);

	}

}
