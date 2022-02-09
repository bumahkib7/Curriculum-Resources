package com.revature.model;

public class User {
	
	private String name;
	private String password;
	private double balance;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String password, double balance) {
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
		return "User [name=" + name + ", password=" + password + ", balance=" + balance + "]";
	}
	
	
	

}
