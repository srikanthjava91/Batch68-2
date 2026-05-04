package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesExDemo12 {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

		File f = new File("c:\\Users\\srknt\\Srikanth Java\\test1\\Srikanth.txt");
		try (FileReader fr = new FileReader(f)) {
			int a = fr.read();
			while (a != -1) {
				System.out.print((char) a);
				Thread.sleep(100);
				a = fr.read();
			}
		}
	}
}
