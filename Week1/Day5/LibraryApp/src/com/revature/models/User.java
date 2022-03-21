package com.revature.models;

import java.util.List;

public class User {
	
	private String username;
	private String password;
	private List<Book> myBooks;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String username, String password, List<Book> myBooks) {
		super();
		this.username = username;
		this.password = password;
		this.myBooks = myBooks;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Book> getMyBooks() {
		return myBooks;
	}
	public void setMyBooks(List<Book> myBooks) {
		this.myBooks = myBooks;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", myBooks=" + myBooks + "]";
	}
	
	
	
	

}
