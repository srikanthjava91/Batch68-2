package com.fleio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriterDemo1 {

	public static void main(String[] args) throws IOException {

		TestPrintWriterDemo1 t1 = new TestPrintWriterDemo1();

		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test1\\sri4.txt",true);
		PrintWriter pw = new PrintWriter(fw);

		pw.println(100);
		pw.println("Hello");
		pw.println('A');

		pw.close();
		fw.close();

	}

}
