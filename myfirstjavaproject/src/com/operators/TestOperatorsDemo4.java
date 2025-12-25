package com.operators;

public class TestOperatorsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int i = 10;
		int j = 7;

		System.out.println(++i);//11
		System.out.println(i++);//11 --> 12 
		System.out.println(++i);//13 
		System.out.println(i++);//13 --> 14 
		System.out.println(--i);//13
		System.out.println(i--);//13 --> 12 
		System.out.println(j--);//7 --> 6
		System.out.println(--j);//5
		System.out.println(++j);//6
		System.out.println(++j);//7 
		System.out.println(j--);//7 --> 6 

		j = j - 3;//6-3 = 3
		i = i + 2;//12 + 2 --> 14

		System.out.println("i value : " + i);//14
		System.out.println("j value : " + j);//3

	}

}
