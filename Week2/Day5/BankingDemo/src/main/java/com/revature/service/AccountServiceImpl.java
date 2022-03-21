package com.revature.service;

import com.revature.models.Account;
import com.revature.repo.AccountDao;
import com.revature.repo.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	
	//Account Service cannot work without a Dao layer! 
	
	public static void main(String[] args) {
		AccountService aService = new AccountServiceImpl();
//		aService.login("bob", "pass");
//		aService.login("bob1", "pass");
//		aService.login("bob", "pass1");
		
//		aService.register("stevey", "pass2", 1000);
//		aService.register("stevey2", "pass2", -1000);
//		aService.register("stevey", "pass2", 1000);
		
		aService.withdraw(aService.retrieveAccountByName("stevey"), 500);
		aService.deposit(aService.retrieveAccountByName("bob"), 250);
	}
	
	private AccountDao aDao = new AccountDaoImpl();

	@Override
	public boolean login(String username, String password) {
		
		Account a = this.retrieveAccountByName(username);
		
		if(a == null) {
			System.out.println("Account with that username does not exist!");
			return false;
		}
		
		if(a.getPassword() == null || !a.getPassword().equals(password)) {
			//if password does not exist or password does not match!
			System.out.println(a);
			System.out.println("Account password does not match!");
			return false;
		}
		
		return true;
	}

	@Override
	public boolean register(String username, String password, double balance) {
		Account newAccount = new Account(username, password, balance);
		
		if(this.retrieveAccountByName(username).getName() != null) {
			System.out.println("Account with this name alread exists!");
			return false;
		}
		
		if(balance < 0) {
			System.out.println("Account can't have a balance less than 0!");
			return false;
		}
		
		return aDao.insertAccount(newAccount);
	}

	@Override
	public Account retrieveAccountByName(String name) {
		// TODO Auto-generated method stub
		return aDao.getAccountByName(name);
	}

	@Override
	public boolean withdraw(Account a, double amount) {

		if(amount < 0) {
			System.out.println("You cannot withdraw negative amount!");
			return false;
		}else if(amount > a.getBalance()){
			System.out.println("You cannot withdraw more than your balance!");
			return false;
		} else {
			
			double newBalance = a.getBalance() - amount;
			return aDao.updateAccountBalance(a, newBalance);
		}
		
		
	}

	@Override
	public boolean deposit(Account a, double amount) {
		// TODO Auto-generated method stub
		if(amount < 0) {
			System.out.println("You cannot deposit negative amount!");
			return false;
		}else {
			
			double newBalance = a.getBalance() + amount;
			return aDao.updateAccountBalance(a, newBalance);
		}
	}

}
