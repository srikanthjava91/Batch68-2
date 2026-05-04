package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//WAP to Read the data from the database and print it in the console. 
public class TestExDemo13 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started !!");

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {

//		- Step 1: Loading the Driver class 
//		Unhandled exception type ClassNotFoundException
//		Reflection API 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded sucessfully !!");

//		- Step 2: Establish the Connection Object 
//			Unhandled exception type SQLException
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");
			System.out.println("Connection created successfully !!");

//		- Step 3: Create Statement Object to communicate with DB
			// Creates a Statement object for sending SQL statements to the database.
			st = con.createStatement();

//		- Step 4: Create a ResultSet to get The data 

			String sql = "select * from employee";
			rs = st.executeQuery(sql);

			while (rs.next()) {

				System.out.print(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
				System.out.println("*******************************");

			}
		}

		finally {
//			- Step 5: Closing the connection
			rs.close();
			st.close();
			con.close();
		}

	}

}
