package com.brandonemerson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {
	static String username="root";
	static String password="emerson64";
	static String dbUrl="jdbc:mysql://localhost:3306/comicbookstore";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection conn=DriverManager.getConnection(dbUrl,username,password))
		{
			System.out.println("Connection established to SQL Database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
