package com.fileio;

import java.io.File;

public class TestFileDemo4 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\srknt\\Srikanth Java");

		String[] listOfFiles = f.list();
		int count = 0;

		for (String f1 : listOfFiles) {
			System.out.println(f1);
			count++;
		}

		System.out.println("Total number Files : " + count);

	}

}
