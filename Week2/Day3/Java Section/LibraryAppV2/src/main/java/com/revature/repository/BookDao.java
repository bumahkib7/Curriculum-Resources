package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Book;
import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class BookDao implements GenericDao<Book>{

	@Override
	public boolean insertObject(Book t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> selectAllObjects() {
		List<Book> bookList = new ArrayList<Book>();

		String sql = "SELECT * FROM books";
		try(Connection conn = ConnectionFactory.getConnection()){
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				bookList.add(new Book(rs.getString("book_name"),rs.getInt("pages")));
			}
		}catch(SQLException e) {
			
		}
		
		return bookList;
	}

	@Override
	public Book selectObjectbyId(int id) {
		//I'm not going to grab using the book id
		//I'm going to grab using the user id! 
		
		return null;
	}
	
	public List<Book> getBooksForUsers(int userId){
		String sql = "SELECT * FROM books WHERE user_foreign_key = ?";
		List<Book> bookList = new ArrayList<>();
		
		
		//try with resources! 
		//Where the resource is closed after we finish with the try block!
		try (Connection conn = ConnectionFactory.getConnection()){ //conn will be closed after we are done!
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			
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
				bookList.add(new Book(rs.getString("book_name"), rs.getInt("pages")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookList;
	}

	@Override
	public boolean updateObject(Book t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteObject(Book t) {
		// TODO Auto-generated method stub
		return false;
	}

}
