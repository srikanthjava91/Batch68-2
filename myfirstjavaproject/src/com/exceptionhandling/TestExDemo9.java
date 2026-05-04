package com.exceptionhandling;

public class TestExDemo9 {

	public static void main(String args[]) {
		System.out.println(m1());
	}

	static public int m1() {
		try {
			System.out.println("in try");
			return 777;
		}
		
//		System.out.println();
		
		catch (NullPointerException e) {
			System.out.println("catch");
			return 888;
		} finally {
			return 999;
		}
	}

}
