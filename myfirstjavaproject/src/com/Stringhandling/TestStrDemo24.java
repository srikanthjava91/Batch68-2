package com.Stringhandling;

public class TestStrDemo24 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());

		StringBuffer sb2 = new StringBuffer("Srikanth");
		System.out.println(sb2.capacity());// 8 16 24

		StringBuffer sb3 = new StringBuffer();
		sb3.append("SrikanthSrikanthSrikanthSrikanthSrikanth");// Initial Capacity *2 + 2
		System.out.println(sb3.capacity());// 16 --> 34 --> 35

		System.out.println("----------------------");
		StringBuffer sb4 = new StringBuffer();
		sb4.append("SrikanthSrikanthSrikanthSrikanthSr");
		sb4.append("ikanthSrikanthSrikanthSrikanthSrikanthSrikanth");
		sb4.append("S");
		System.out.println(sb4.capacity());// 16

	}

}
