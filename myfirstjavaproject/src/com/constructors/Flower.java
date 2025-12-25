package com.constructors;

class Hello{
	String name = "hello";
}

class Flower extends Hello{

	String name = "Lotus";

	public static void main(String[] args) {
		System.out.println("main method sarted from Flower !!");
	}

}

class Rose extends Flower {

	String name = "Rose";

	public static void main(String[] args) {
		System.out.println("main method sarted from Rose !!");

		Rose r = new Rose();
		r.show();

//		Cannot use super in a static context
//		Cannot use this in a static context
//		System.out.println(super.name);
//		System.out.println(this.name);
	}

	// instance method
	void show() {
		System.out.println(((Hello)this).name);
		System.out.println(super.name);
		System.out.println(this.name);
	}

}
