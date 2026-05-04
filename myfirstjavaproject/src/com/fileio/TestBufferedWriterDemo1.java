package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriterDemo1 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test1\\sri3.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(100);
		bw.newLine();
		bw.write("Java is simple in vcube");
		bw.newLine();
		bw.write('A');
		bw.newLine();
		bw.write("Hello");
		bw.newLine();

		bw.close();
		fw.close();
	}
}
