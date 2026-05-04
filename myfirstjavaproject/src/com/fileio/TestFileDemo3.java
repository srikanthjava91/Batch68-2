package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo3 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\sri2.txt");

		System.out.println(f.getAbsolutePath());
		System.out.println(f.getAbsoluteFile());

		System.out.println(f.getCanonicalPath());
		System.out.println(f.getCanonicalFile());
		
		System.out.println(f.getTotalSpace());//
		System.out.println(f.getUsableSpace());
		System.out.println(f.getFreeSpace());//
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		System.out.println(f.lastModified());

		
		
		if (!f.exists()) {
			f.createNewFile();
		} else {
			System.err.println("The File with this name already exist !!");
		}

		System.out.println("main method ended !!");
	}

}
