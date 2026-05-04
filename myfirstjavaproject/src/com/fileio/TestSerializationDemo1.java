package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {

	private static final long serialVersionUID = -8215906153464217073L;
	// private static final long serialVersionUID = 1L;
	String username = "Srikanth";
	transient String password = "Java";

}

public class TestSerializationDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started !!");

		User user = new User();

		FileOutputStream fos = new FileOutputStream("C:\\Users\\srknt\\Srikanth Java\\test1\\user.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.close();

	}

}
