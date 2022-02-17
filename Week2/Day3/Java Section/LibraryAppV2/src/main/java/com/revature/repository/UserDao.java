package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class UserDao implements GenericDao<User> {

	@Override
	public boolean insertObject(User t) {
		String insertSql = "INSERT INTO users (username,password) VALUES (?,?);";
		boolean success = false;
		try(Connection conn = ConnectionFactory.getConnection();){
			PreparedStatement ps = conn.prepareStatement(insertSql);
			ps.setString(1, t.getUsername());
			ps.setString(2, t.getPassword());
			
			ps.execute();
			success = true;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return success;
	}

	@Override
	public List<User> selectAllObjects() {
		String sql = "SELECT * FROM users";
		List<User> userList = new ArrayList<>();
		BookDao bdao = new BookDao();
		
		//try with resources! 
		//Where the resource is closed after we finish with the try block!
		try (Connection conn = ConnectionFactory.getConnection()){ //conn will be closed after we are done!
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			/*
			 * Prepared Statements are better because: 
			 * 	We don't have SQL injection happening e.g. 
			 * 		Select * from table where name = ; Drop Table;
			 * 
			 * Prepared Statements ensure the expression is treated as a string!
			 * 
			 * It's a lot cleaner to work with, because you don't have to deal with 
			 * 	''. 
			 * 
			 */
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				userList.add(new 
						User(rs.getString("username"),
							rs.getString("password"),
							bdao.getBooksForUsers(rs.getInt("user_id"))));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userList;
	}

	@Override
	public User selectObjectbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateObject(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteObject(User t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean checkCredentials(String username, String password) {
		String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
		List<User> userList = new ArrayList<>();
		
		
		//try with resources! 
		//Where the resource is closed after we finish with the try block!
		try (Connection conn = ConnectionFactory.getConnection()){ //conn will be closed after we are done!
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			/*
			 * Prepared Statements are better because: 
			 * 	We don't have SQL injection happening e.g. 
			 * 		Select * from table where name = ; Drop Table;
			 * 
			 * Prepared Statements ensure the expression is treated as a string!
			 * 
			 * It's a lot cleaner to work with, because you don't have to deal with 
			 * 	''. 
			 * 
			 */
			
			ResultSet rs = ps.executeQuery();
			return rs.next(); //check if we get something! 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
	}

}
