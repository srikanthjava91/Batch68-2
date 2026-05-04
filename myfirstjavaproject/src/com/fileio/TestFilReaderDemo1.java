package com.fileio;

import java.io.File;
import java.io.FileReader;

public class TestFilReaderDemo1 {

	public static void main(String[] args) throws Exception {
		System.out.println("main method started !!");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\sri4.txt");
		FileReader f1 = new FileReader(f);

		// Reads a single character
		int i = f1.read();

		while (i != -1) {
			System.out.print((char) i);
			i = f1.read();
		}

//		Resource leak: 'f1' is never closed
		f1.close();
	}

}
