package com.oops.abstracion;

public class TestInAbsDemo2 {

	public static void main(String[] args) {

		// Cannot instantiate the type TestAbs
//		TestAbs t = new TestAbs();

		TestIn1 t1 = new TestInImpl1();
		t1.method1();
		t1.method2();
		t1.method3();

		System.out.println("******************");
		TestAbs t2 = new TestInImpl2();
		t2.method2();
		t2.method3();
		t2.method5();
		t2.method7();
		System.out.println(t2.a);
		System.out.println(t2.name);
		System.out.println(TestAbs.name);
		
		System.out.println("******************");
		
		
	}
}
