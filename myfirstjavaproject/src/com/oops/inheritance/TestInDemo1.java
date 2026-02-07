package com.oops.inheritance;

public class TestInDemo1 {

//	@Override
//	public String toString() {
//		return "Hello";
//	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called !!");
	}

	public static void main(String[] args) {

		TestInDemo1 t1 = new TestInDemo1();

		System.out.println(t1);// Address of the Object //2b2fa4f7
		System.out.println(t1.toString());

		System.out.println(t1.hashCode());
		int a = 0x2b2fa4f7;
		System.out.println(a);

		System.out.println(t1.getClass());
//		t1 = null;
		System.gc();

		TestInDemo1 t2 = new TestInDemo1();
		System.out.println("t1: " + t1);
		System.out.println("t2: " + t2);

		TestInDemo1 t3 = t2;
		System.out.println(t2.equals(t3));

	}

}
