package com.exceptionhandling;

public class TestExDemo10 {

	public static void main(String[] args) {
		System.out.println("main mrtod started !!");

		try {
			System.out.println("in try 1");
//			System.out.println(10/0);

			try {
				System.out.println("in try 2");
				try {
					System.out.println("in try 5");
				}catch(Exception e2) {
					System.out.println("in catch 5");
				}finally {
					System.out.println("in finally 5");
				}
			} catch (Exception e) {
				System.out.println("in catch 2");
			}finally {
				System.out.println("in finally 2");
			}

		} catch (Exception e) {
			System.out.println("in catch 1");
			System.out.println(10/0);
			try {
				System.out.println("in try 3");
			} catch (Exception e1) {
				System.out.println("in catch 3");
			}finally {
				System.out.println("in finally 3");
			}
		} finally {
			System.out.println("in finally 1");
			System.out.println(10/0);
			try {
				System.out.println("in try 4");
			} catch (Exception e) {
				System.out.println("in catch 4");
			}finally {
				System.out.println("in finally 4");
			}
		}
		
		System.out.println("main mrtod ended !!");
	}
}
