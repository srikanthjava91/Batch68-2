package com.innerclasses;

class TestOuter4 {
	static int orgId = 555;
	static String orgName = "Vcube";
	int id = 100;
	String name = "unknown";

	void method1() {
		System.out.println("method1 called ");

		class TestInner4 {
			void method4() {
				System.out.println("method 4 called ");
			}
		}

		TestInner4 t = new TestInner4();
		t.method4();

	}

}

public class TestDemo4 {

	public static void main(String[] args) {

		TestOuter4 t = new TestOuter4();
		System.out.println(TestOuter4.orgId);
		System.out.println(TestOuter4.orgName);
		System.out.println(t.id);
		System.out.println(t.name);
		t.method1();

	}

}
