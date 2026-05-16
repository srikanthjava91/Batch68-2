package com.innerclasses;

class TestOuter1 {
	int id = 123;

	class TestInner1 {

		void display() {
			System.out.println("display method called " + id);
		}
	}

}

//Driver class 
public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestOuter1 t1 = new TestOuter1();
		System.out.println(t1.id);

//		If we want to create Inner class Object, we must need to use Outer classes.
//		There is no chance of creating Objects for Inner classes, Without Outer classe.
//		TestOuter1.TestInner1 t2 = t1.new TestInner1();//valid
//		TestOuter1.TestInner1 t2 = new TestOuter1().new TestInner1();//valid
		new TestOuter1().new TestInner1().display();
		;// valid
//		t2.display();//valid

	}

}
