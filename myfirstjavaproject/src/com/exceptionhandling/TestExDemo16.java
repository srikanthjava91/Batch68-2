package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo16 {

	public static void main(String[] args) {

		File f = new File("");

		try {
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

}
