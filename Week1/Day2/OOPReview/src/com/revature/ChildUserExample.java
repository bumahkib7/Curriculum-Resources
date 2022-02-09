package com.revature;

import com.revature.encapsulation.User;

public class ChildUserExample extends User{
	
	/*
	 * What do I inherit from the User object?
	 * 	name
	 * 	password
	 * 	membership
	 * 	all the methods!
	 */
	public void childMethod() {
		System.out.println(this.favoriteColor);
		System.out.println(this.membership);
//		System.out.println(this.name); //outside the package
//		System.out.println(this.password); //private, so outside the class!
	}
	
	public static void main(String[] args) {
		User u = new User();
//		u.membership = true;
		
		
	}

}
