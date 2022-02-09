package com.revature.repo;

import com.revature.model.User;

public class UserRepository {
	
	public static User[] userStorageArray = new User[2];
	private static int index = 0;
	
	public static void addUser(User u) {
		userStorageArray[index] = u;
		index++;
	}
	
	public static User retrieveUserByName(String username) {
		
		for(User u: userStorageArray) {
			if(u!= null && username.equals(u.getName())) {
				return u;
			}
		}
		
		return null;
	}

}
