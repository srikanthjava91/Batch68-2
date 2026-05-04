package com.Stringhandling;

public class TestStrDemo25 {

	public static void main(String[] args) {

		System.out.println("main method strated ");

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());// 16

		sb1.ensureCapacity(35);
		System.out.println(sb1.capacity());// 16

		StringBuffer sb2 = new StringBuffer("Java is simple");
//		System.out.println(sb2.reverse());

		sb2.delete(0, 2);
		System.out.println(sb2);//va is simple
		
		sb2.deleteCharAt(3);
		System.out.println(sb2);//va s simple
		
		
		StringBuffer sb3 = new StringBuffer("Java is simple");
		
		char[] arrCh = new char[10];
		sb3.getChars(0, 4, arrCh, 0);
		
		System.out.println(arrCh);//Java
		
		sb3.setCharAt(1, 'A');
		System.out.println(sb3);
		

	}

}
