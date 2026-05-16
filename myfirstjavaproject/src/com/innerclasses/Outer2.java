package com.innerclasses;

public class Outer2 {
	void outerMethod() {
		int num = 100;

		class LocalInner {
			void print() {
				System.out.println("Value: " + num);
			}
		}

		LocalInner local = new LocalInner();
		local.print();
	}

	public static void main(String[] args) {
		new Outer2().outerMethod();
	}
}
