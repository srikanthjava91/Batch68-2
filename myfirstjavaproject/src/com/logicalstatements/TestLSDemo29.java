package com.logicalstatements;

//break and continue 
public class TestLSDemo29 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello : " + i);
			if (i == 5) {
				break;
			}
		}
		System.out.println("*******************");
		
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("Hello : " + i);
		}
	}
}
