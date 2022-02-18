package com.revature.repo;

import java.util.List;

import com.revature.models.Account;

public interface AccountDao {
	
	//This is the only class that will deal with SQL strings! 
	//This class will provide methods to the rest of my java to interact with the db!
	//CRUD
	
	boolean insertAccount(Account a); 
		
	List<Account> getAllAcounts();
	Account getAccountByName(String name);
	Account getAccountById(int id);
	
	boolean updateAccountBalance(Account a, double newBalance);
	
//	boolean deleteAccount(Account a); Bank accounts should not be permanently deleted!
	
	

}
