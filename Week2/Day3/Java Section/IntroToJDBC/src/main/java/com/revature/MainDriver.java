package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainDriver {
	
	/*
	 * JDBC - Java Database Connection 
	 * 
	 * JDBC API handles database connections for me, and provides useful 
	 * 	methods to manipulate the database through Java 
	 * 
	 * Important interfaces in JDBC: 
	 * 		DriverManager
	 * 		Connection
	 * 		Statement 
	 * 		PreparedStatement 
	 * 
	 * What do I need to connect to a database?
	 * 	Endpoint, username and password 
	 * 
	 * 1) Connect to your own database, insert and view information from tables. 
	 * 2) Implement the rest of the CRUD methods, Update and Delete methods (DML)
	 * 3) Convert the records into objects in Java 
	 * 4) Using Scanner, allow a end user to submit or view info in the database. 
	 * 4) Review DAO Design patterns. 
	 */
	
	
	
	
	public static void main(String[] args) {
		
//		final String URL = "jdbc:postgresql://{host}[:{port}]/[{database}]";
		final String URL = ;
		final String USERNAME = ;
		final String PASSWORD = ;
		
		Connection connection;
		
		//First I need to establish a connection with my Database
		
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			System.out.println("I am connected!");
			
			//let's try INSERT 
			String insertSql = "INSERT INTO better_fruit_table VALUES ('Lemon');";
			Statement statement2 = connection.createStatement();
			statement2.execute(insertSql);
			
			
			
			
			
			
			//Once I'm connected, I'd like to send a SELECT query!
			String sql = "SELECT * FROM better_fruit_table";
			
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(sql);
			
			List<String> stringResults = new ArrayList<>();
			
			while(rs.next()) { //keep looping until the resultSet is empty!
//				stringResults.add(rs.getString(1));
				stringResults.add(rs.getString("fruit_name"));
			}
			
			System.out.println(stringResults);
			
			
		} catch (SQLException e) {
			System.out.println("I am not connected!");
			e.printStackTrace();
		}
		
	}

}
