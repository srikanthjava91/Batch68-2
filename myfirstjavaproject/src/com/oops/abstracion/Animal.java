package com.oops.abstracion;

public interface Animal {
	
	class Test{
		
	}
	
	 String orgName = "Vcube";
	 
//	 static{
//		 
//	 }

	public abstract void sound();

	public abstract void walk();

	public abstract void eat();

	public abstract void sleep();

//	From 1.8 onwards Interfaces can also have implementation through default methods.
//	default methods introduced to support Backward-compatibility, 
//	Whenever we want to provide default behaviors for every class then choose default methods.
//	default methods we can override based on our requirements.
//	In Normal interface, can have any number of abstract & default methods 

	public default void drink() {
		System.out.println("Animals can drink water !! ");
		hello();
	}

	public default void friendly() {
		System.out.println("Animals can friendly !!! ");
		hello();
	}

//	From 1.8 onwards Java introduced static methods 
//	to provide constant behavior for all classes.
//	For static methods override is not possible as per MOR rules.
//	static methods we can call by using only interface name but 
//	we can not call by using reference variable.

	public static void breath() {
		System.out.println("Every animal must breath !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		breath();
	}

//	From 1.9 onwards private methods introduced to provide re-usability in default methods.
//	private methods we cannot override.
	private void hello() {
		System.out.println("Hello Guys, Good morning !!");
		System.out.println("Hello Guys, Good morning !!");
		System.out.println("Hello Guys, Good morning !!");
		System.out.println("Hello Guys, Good morning !!");
		System.out.println("Hello Guys, Good morning !!");
		System.out.println("Hello Guys, Good morning !!");
		System.out.println("Hello Guys, Good morning !!");

	}

}
