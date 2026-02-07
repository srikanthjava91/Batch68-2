package com.arrays;

public class TestArraysDemo2 {

	public static void main(String[] args) {

		String[] names = new String[5];// 0 1 2 3 4

		names[0] = "Karimulla";
		names[1] = "Umesh";
		names[2] = "Yashwanth";
		names[3] = "Aslesha";
		names[4] = "Pavitra";

//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}

		for (String name : names) {
			System.out.println(name);
		}
	}
}
