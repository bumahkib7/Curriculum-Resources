package com.revature.abstraction;

public interface AuthenticationService {
	
	boolean login(String username, String password);
	boolean logout();
	
//	User retrieveUser(String username);
	
	boolean checkUsernameExists(String newUsername);

}
