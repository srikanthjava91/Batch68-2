package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReaderDemo1 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\sri4.txt");
		FileReader f1 = new FileReader(f);
		BufferedReader br = new BufferedReader(f1);

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

		br.close();
		f1.close();
	}

}
