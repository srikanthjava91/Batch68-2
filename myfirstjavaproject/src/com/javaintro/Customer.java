package com.javaintro;

//16 
//0 to 9 --> a-f 
public class Customer {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called !");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		Customer c1 = new Customer();// --> memory
//		com.javaintro.Customer@1dbd16a6 --> 1
		Customer c2 = new Customer();// --> memory
//		com.javaintro.Customer@7ad041f3  --> 1
		Customer c3 = new Customer();// --> memory
//		com.javaintro.Customer@251a69d7  --> 2

		// nullifying the object reference
		c1 = null;

		Customer c4 = new Customer();
		// Re-assigining the object
		c1 = c4;

		// Anonymous object
		new Customer();

		System.gc();// --> Runs the garbage collector in the Java Virtual Machine.
		System.out.println(c1);// -->1
		System.out.println(c2);// -->2
		System.out.println(c3);// -->3
		System.out.println(c4);// -->3

	}
}
