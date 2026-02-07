package com.oops.shallowdeep;

class Student implements Cloneable {
	String name;
	Address address;

	Student() {

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}

}

class Address {
	String city = "Guntur";

	public Address(String city) {
		this.city = city;
	}

}

public class TestShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !");

		Address ad = new Address("Hyderabad");
		Student s1 = new Student("Nithin", ad);
		System.out.println(s1.name);
		System.out.println(s1.address.city);


		Student s2 = (Student) s1.clone();
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println("*******");
		s2.name = "srikanth";
		s2.address.city = "Banaglore";

		System.out.println(s1.name);// Nithin
		System.out.println(s1.address.city);// Hyderabad --> Banglore

		System.out.println(s2.name);// Srikanth
		System.out.println(s2.address.city);// Banglore

	}

}
