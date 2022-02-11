package com.revature.service;

import com.revature.models.Book;
import com.revature.models.User;

//This interface will define the "business" logic of our application!
public interface LibraryService {
	
	public boolean register(User u);
	
	public User login(String username, String password);
	
	public boolean withdraw(User u, Book b);
	
	public boolean deposit(User u, Book b);

}
