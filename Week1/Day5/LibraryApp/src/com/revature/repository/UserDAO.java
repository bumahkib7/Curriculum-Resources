package com.revature.repository;

import com.revature.models.User;

//Is the communication point between Java and out database!
//Right now, we don't have that!
//But we can still define the methods that will be required
public interface UserDAO {

	//Read
	public User getUserByUsername(String username);
	
	//Create
	public boolean insertUser(User u);
	
	//Delete
	public boolean deleteUserByUsername(String username);
	
	//Update
	public boolean updateUserPassword(User u,String password);
}
