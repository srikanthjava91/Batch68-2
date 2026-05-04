package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo7 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("in try !!");
			System.out.println("enter x value : ");
			int x = sc.nextInt();
			int a = 10 / x;
			System.out.println(a);

			String str = "Sajan";
			System.out.println(str.charAt(a));

		}

		catch (ArithmeticException | StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

//		catch (ArithmeticException e) {
//			System.err.println("in catch of AE !!");
//			e.printStackTrace();
//
//		} catch (StringIndexOutOfBoundsException e) {
//			System.err.println("in catch of SIE !!");
//		}

		finally {
			System.out.println("in finally ");
			
			try {
				System.out.println("in try finally ");
			}catch(Exception e) {
				System.out.println("in catch !!");
			}finally {
				System.out.println("in finally ");
			}
			
			sc.close();
		}

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");

	}

}
