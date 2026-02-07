package com.arrays;

public class TestArraysDemo3 {

	public static void main(String[] args) {

//		The literal 2147483648 of type int is out of range
//		int[] numbers = new int[2147483648];

//		Exception in thread "main" java.lang.NegativeArraySizeException: -100
//		at com.arrays.TestArraysDemo3.main(TestArraysDemo3.java:10)
//		int[] numbers = new int[-100];

//		Exception in thread "main" java.lang.OutOfMemoryError: 
//		Requested array size exceeds VM limit
//		at com.arrays.TestArraysDemo3.main(TestArraysDemo3.java:14)
//		int[] numbers = new int[2147483647];

		int[] numbers = new int[3];// 0 1 2
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
//		Index 3 out of bounds for length 3
//		at com.arrays.TestArraysDemo3.main(TestArraysDemo3.java:23)


		for (int n : numbers) {
			System.out.println(n);
		}

	}

}
