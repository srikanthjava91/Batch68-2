package com.Stringhandling;

public class TestStrDemo14 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		String str = "Hello";
		char[] arrCh = str.toCharArray();
//		for (int i = arrCh.length - 1; i >= 0; i--) {
//			System.out.print(arrCh[i] + "");
//		}

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			char temp = arrCh[start];
			arrCh[start] = arrCh[end];
			arrCh[end] = temp;

			start++;
			end--;
		}
		String reversed = new String(arrCh);
		System.out.println("Reverse String is :  " + reversed);
	}
}
