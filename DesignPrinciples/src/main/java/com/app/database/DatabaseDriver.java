package com.app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDriver {
	
	private static final String DB_PATH_A2_LOCAL = "jdbc:mysql://localhost:3306/a2?autoReconnect=true&useSSL=false";
	private static final String DB_PATH_A2_LOCAL_USER = "root";
	private static final String DB_PATH_A2_LOCAL_PASS = "";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_PATH_A2_LOCAL, DB_PATH_A2_LOCAL_USER, DB_PATH_A2_LOCAL_PASS);
			// connection=DriverManager.getConnection("jdbc:mysql://mathlab.utsc.utoronto.ca/cscc43f18_leunga56?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC",
			// "leunga56", "leunga56");
		} catch (SQLException e) {
			System.out.println("Something went wrong with connection... sql exception");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Something went wrong with connection... class not not");
		}
		
		return connection;
	}

}
