package com.revature.service;

import com.revature.models.Book;
import com.revature.models.User;
import com.revature.repository.UserDAO;
import com.revature.repository.UserDAOImpl;

public class LibraryServiceImpl implements LibraryService{
	
	private UserDAO uDao = new UserDAOImpl();

	@Override
	public boolean register(User u) {
		//the service might be as simple as calling a single method in our dao/repo layer!
		return uDao.insertUser(u);
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		
		User u = uDao.getUserByUsername(username);
		
		if(u != null) {
			if(u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}

	@Override
	public boolean withdraw(User u, Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deposit(User u, Book b) {
		// TODO Auto-generated method stub
		return false;
	}

}
