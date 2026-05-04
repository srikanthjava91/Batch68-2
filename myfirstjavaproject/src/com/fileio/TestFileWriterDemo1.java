package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started !");

		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test1\\sri2.txt");

		//Writes a single character.
		fw.write(100);
		fw.write('\n');
		fw.write('A');
		fw.write('\n');
		fw.write("Hello");
		fw.flush();
		fw.close();

	}

}
