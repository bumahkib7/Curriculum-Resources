package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String URL = "jdbc:postgresql://castor.db.elephantsql.com:5432/hkvfgdyp";
	private static final String USERNAME = "hkvfgdyp";
	private static final String PASSWORD = "0mjgpvuYm2TiuuQj3rBnMXTPCEVTPvqU";
	
	private static Connection connection;
	
	public static Connection getConnection() {
		
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}

}
