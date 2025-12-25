package com.constructors;

public class Customer {

	int cid;
	String cname;
	int cage;

	// no arg constructor
	Customer() {
		System.out.println("no arg constructor called !");
		cid = 101;
		cname = "unknown";
		cage = 18;
	}

	// one arg constructor
	Customer(int cid) {
		this();
		System.out.println("1-arg constructor called !");
		this.cid = cid;

	}

	// Two arg constructor
	Customer(int cid, String cname) {
		this(cid);
		System.out.println("2-arg constructor called !");
		this.cname = cname;
	}

	// three arg constructor
	Customer(int cid, String cname, int cage) {
		this(cid, cname);
		System.out.println("3-arg constructor called !");
		this.cage = cage;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Customer c1 = new Customer();
		c1.display();

		Customer c2 = new Customer(102);
		c2.display();

		Customer c3 = new Customer(103, "Sajan");
		c3.display();

		Customer c4 = new Customer(104, "Aswanth", 22);
		c4.display();

		System.out.println("main method ended !");
	}

	void display() {
		System.out.println("*******************************");
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Name : " + cname);
		System.out.println("Customer Age : " + cage);
		System.out.println("*******************************");
	}
}
