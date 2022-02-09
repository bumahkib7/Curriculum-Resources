package com.revature.models;

import java.io.Serializable;

/*
 * In Java we have classes that can represent "models"
 * There models are used to keep track of a state or multiple states!
 * 
 * Java Bean: 
 * 	Is a design pattern that allows us to manipulate "models" with ease. 
 * 	It states a few properties that a class must have. 
 * 
 * 1) Encapsulation! private variables and public getters and setters!
 * 2) Public no-args constructor!
 * 3) Serializable (Marker Interface) 
 * 
 * 
 * Java Bean vs POJO? 
 * 	POJO is Plain Old Java Object, a looser standard. 
 * 	Normally used to refer to any class that is just representing a model. 
 * 
 * 	Java Bean is a design pattern with more restrictions!
 */
public class User implements Serializable{
	


	public User() {
		super();
	}
	
	public User(String username, String password) {
		super();
		this.password = password;
		this.username = username;
	}
	
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override 
	public String toString() {
		return "User Class: " + " username = " + this.username + ", password = " + this.password;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//Check if obj, is an "instance" of User
		if(obj instanceof User) {
//			obj.getUsername();
			User otherUser = (User) obj; //the obj, now sees itself as a User!
			//This can be a dangerous operation, especially if you don't check 
			// what instance the object is. 
			
			//If obj is an instance of User and have matching usernames
			//then we return true!
			if(this.username.equals(otherUser.username) ) {
				return true;
			}
			
		}
		return false;
		
	}
	

}
