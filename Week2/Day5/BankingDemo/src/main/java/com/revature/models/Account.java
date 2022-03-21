package com.revature.models;

public class Account {
	
	private String name;
	private String password;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String name, String password, double balance) {
		super();
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", password=" + password + ", balance=" + balance + "]";
	}
	
	

}
