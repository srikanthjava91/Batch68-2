package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo11 {

	public static void main(String[] args) throws IOException{

		System.out.println("main method started !!");
		File f = new File("c:\\Users\\srknt\\Srikanth Java\\test1\\Srikanth1.doc");
		f.createNewFile(); // Unhandled exception type IOException

		System.out.println("main method ended !!");

	}

}
