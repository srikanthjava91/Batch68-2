package com.fileio;

import java.io.File;
import java.io.IOException;

//WAP to create a File through Java File IO -> in 

public class TestFileDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started !!");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\vishnu1.txt");
		
		boolean isFileCreated = f.createNewFile();// Unhandled exception type IOException
		
		if(isFileCreated) {
			System.out.println("File is created Succussfully !");
		}else {
			System.out.println("Something Went Wrong !!");
		}
		System.out.println("main method ended !!");
	}
}
