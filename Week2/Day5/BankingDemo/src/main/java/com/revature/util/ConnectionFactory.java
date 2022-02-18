package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private final static String URL = "jdbc:postgresql://jelani.db.elephantsql.com:5432/eqazkzop";
	private final static String USERNAME = "eqazkzop";
	private final static String PASSWORD = "U57hCP18TvUk1SpF2uqIFjoCh2UdhyOj";
	
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		return conn;
	}
	


}
