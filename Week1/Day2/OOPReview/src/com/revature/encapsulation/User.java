package com.revature.encapsulation;

/*
 * Access modifiers: 
 * 	public :
 * 		Accessible anywhere in the project!
 * 		All classes and all packages!
 * 
 * (implicit) package: 
 * 		When no access modifier is provided, access defaults to package. 
 * 		package means that the variable or method is not accessible outside the package. 
 * 
 * protected: 
 * 	the variable or method is only accessible within the package or to a child 
 * 	class outside of the package!
 * 
 * 	private:
 * 		The variables and methods that are private will only belong to the 
 * 		class itself!
 * 
 * What does it mean to encapsulate a class?
 * 	This is applicable to Model classes, User, Account, Animal, Book, etc...
 * 	These are example of classes that are designed to store their state. 
 * 	Via private variables and public getters and setters!
 */
public class User {
	
	String name;
	private String password;
	protected boolean membership;
	public String favoriteColor;
	public Book[] myBooks;
	
	
	//We provide public methods!
	//Getters: To get our values
	//Setters: To modify our values
	
	public String getName() {
		return this.name; //class can have access to it's own variables!
	}
	
	public void setName(String name) {
		if(name.equals("fakey fake")) {
			System.out.println("Don't do that!");
		}else {
			this.name = name;
		}
		
	}
	
	public boolean getMembership() {
		return this.membership;
	}
	
	public void setMembership(boolean membership)	{
		this.membership = membership;
	}

}
