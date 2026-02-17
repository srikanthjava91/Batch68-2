package com.oops.inheritance;

//Super or Base or Parent 
class Dog {

	String name = "Snoopy";

	void eat() {
		System.out.println("Can eat non veg !");
	}

}

//Sub or Derived or Child
class ChildDog extends Dog {
	String name = "Puppy";

	@Override
	void eat() {
		System.out.println("Can eat only veg !");
	}

}

public class TestInDemo2 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		ChildDog cd = new ChildDog();
		System.out.println(cd.name);
		cd.eat();

	}

}
