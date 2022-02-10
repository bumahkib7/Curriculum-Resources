package com.revature.repo;

import com.revature.exceptions.BusinessException;
import com.revature.model.User;

public class UserRepository {
	
	public static User[] userStorageArray = new User[1];
	private static int index = 0;
	
	//limitations of arrays!
	// size - size is fixed is a limitation!
	// Array does not provide any nice "data structure" methods, just a length property 
	//		Add, Delete, update, etc ..
	// Arrays don't check if a value is a duplicate?? 
	
	public static void addUser(User u) {
		
		userStorageArray[index] = u;
		
		index++;
		
		if(index >= userStorageArray.length) {
			//Create a brand new dummy array
			//Copy over all the existing accounts
			//Replace userStorageArray with new, bigger dummy array!
			
			System.out.println("Inside extending method!");
			
			User[] newUserArray = new User[2*userStorageArray.length]; //doubling the size of the array!
//			System.arraycopy(userStorageArray,0	, newUserArray, 0, userStorageArray.length); //don't waste time rebuilding the wheel!
			
			for(int i = 0; i< userStorageArray.length; i++) {
				newUserArray[i] = userStorageArray[i];
			}
			
			userStorageArray = newUserArray;
			
			
		}
		
	}
	
	public static User retrieveUserByName(String username) {
		
		for(User u: userStorageArray) {
			if(u!= null && username.equals(u.getName())) {
				return u;
			}
		}
		
		return null;
	}

	public static User retrieveUser(String name, String password) throws BusinessException, NullPointerException{
		
		User retrievedUser = null;
		
		for(User u: userStorageArray) {
			if(u!= null && name.equals(u.getName()) && password.equals(u.getPassword())) {
				retrievedUser = u;
			}
		}
		
		if(retrievedUser == null) {
			throw new BusinessException("User doesn't exist!");
		}
		
		return retrievedUser;
	}

}
