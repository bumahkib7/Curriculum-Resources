package com.revature.exceptions;

//My custom exception is now a checked exception!
public class CustomException extends Exception{

	public CustomException(String name) {
		super(name);
	}
}
