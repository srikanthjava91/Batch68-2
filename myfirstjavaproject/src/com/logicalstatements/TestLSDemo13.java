package com.logicalstatements;

//Q) WAP to print 0 to 10 numbers including even numbers.?
//Q) WAP to print 10 to 0 numbers including odd numbers ..? 

public class TestLSDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		for (int i = 0; i <= 10; i++) {
			if (i != 0 && i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("*******************");
		for (int i = 10; i >= 0; i--) {
			if (i % 2 != 0) {
				System.out.print(i +" ");
			}
		}
	}

}
