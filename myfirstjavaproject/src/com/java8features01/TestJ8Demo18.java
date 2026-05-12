package com.java8features01;

import java.util.function.Supplier;

//WAP to generate OTP with 6 digits.?
public class TestJ8Demo18 {

	public static void main(String[] args) {
//		System.out.println(Math.random()*10);

		Supplier<String> s1 = () -> {
			String otp = "";

			// greater than or equal to 0.0 and less than 1.0.
			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);// 257197
			}

			return otp;
		};

		System.out.println(s1.get());

	}

}
