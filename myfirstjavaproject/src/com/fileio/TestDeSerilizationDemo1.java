package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeSerilizationDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\srknt\\Srikanth Java\\test1\\user.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		User user = (User) ois.readObject();
		System.out.println(user.username);
		System.out.println(user.password);
	}

}
