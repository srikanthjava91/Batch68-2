package com.languagefundamentals;

public class TestDemo1 {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	// Native methods do not specify a body
	native void method1();

	public static void main(String[] args) {
		System.out.println("mian method started !");
		TestDemo1 t1 = new TestDemo1();
		t1.method1();
	}

}
