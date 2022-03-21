package com.revature.service;

import java.util.List;

import com.revature.models.Book;
import com.revature.models.User;
import com.revature.repository.BookDao;
import com.revature.repository.GenericDao;
import com.revature.repository.UserDao;

public class LibraryServiceImpl implements LibraryService{
	
	private UserDao uDao = new UserDao();
	private BookDao bDao = new BookDao();

	@Override
	public boolean register(User user) {
		//the service might be as simple as calling a single method in our dao/repo layer!
		
		//grabbing all user objects and comparing the username to all of them!
		List<User> userList = uDao.selectAllObjects();
		for(User u: userList) {
			if(u.getUsername().equals(user.getUsername())) {
				return false;
			}
		}
		return uDao.insertObject(user);
		
//		if(uDao.checkCredentials(user.getUsername(), user.getPassword())) {
//			return uDao.insertObject(user);
//		}
//		return false;
		
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		List<User> userList = uDao.selectAllObjects();
		
		for(User u: userList) {
			if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
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
		
		return false;
	}

	@Override
	public List<Book> getAllAvailableBooks() {
		// TODO Auto-generated method stub
		return bDao.selectAllObjects();
	}

}
