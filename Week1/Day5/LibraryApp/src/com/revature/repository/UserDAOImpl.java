package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;

public class UserDAOImpl implements UserDAO{
	
	private List<User> userDatabase;	
	
	

	public UserDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
		
		userDatabase = new ArrayList<>();
		
		//initalize with some dummy data!
		userDatabase.add(new User("bob1", "pass1", new ArrayList<>()));
		userDatabase.add(new User("bob2", "pass2", new ArrayList<>()));
		userDatabase.add(new User("bob3", "pass3", new ArrayList<>()));
	}

	@Override
	public User getUserByUsername(String username) {
		User user = null;
		for(User u: this.userDatabase) {
			if(u.getUsername().equals(username)) {
				user = u;
			}
		}
		return user;
	}

	@Override
	public boolean insertUser(User u) {
		// TODO Auto-generated method stub
		return this.userDatabase.add(u);
	}

	@Override
	public boolean deleteUserByUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserPassword(User u, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
