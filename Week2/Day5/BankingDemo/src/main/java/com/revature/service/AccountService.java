package com.revature.service;

import com.revature.models.Account;

public interface AccountService {
	
	//Service layer is purely Java logic. 
	//Defines the "business" logic of our application. 
	
	boolean login(String username, String password);
	
	boolean register(String username, String password, double balance);
	
	Account retrieveAccountByName(String name);
	
	boolean withdraw(Account a, double amount);
	
	boolean deposit(Account a, double amount);
	

}
