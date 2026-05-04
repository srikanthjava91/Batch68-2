package com.fileio;

import java.io.File;
import java.io.IOException;

//WAP to create a Folder through Java File IO ->

public class TestFileDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\sri1");
		boolean isDirectoryCreated = f.mkdir();

		f.delete();

		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());

		if (isDirectoryCreated) {
			System.out.println("Directory Created Successfully !!");

			File f1 = new File(f, "srikanth.txt");
			f1.createNewFile();

		} else {
			System.out.println("SOmething went wrong !!");
		}

	}

}
