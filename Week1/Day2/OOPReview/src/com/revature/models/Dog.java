package com.revature.models;

public class Dog {
	
	//Define how to create instances of Dog
	// Constructor!
	// Constructors allow us to create an instance of a Class
	// Constructors are special methods, they have the same name as the class
	//  	and have no return type.
	
	/*
	 * 3 Categories of Constructors: 
	 * 		Default Constructor:
	 * 			When we don't write a constructor, the JVM will provide a constructor!
	 * 		No-args Constructor :
	 * 			No args constructor is similar to the default constructor except 
	 * 			it is written by us and we can provide additional logic!
	 * 		Parameterized Constructor
	 */
	
	public Dog(){
		//my constructor logic here!
		System.out.println("I'm being created! (No Args Constructor)");
	}
	
	public Dog(int a, String s, boolean b) {
		System.out.println("I'm being created in the parameterized constructor");
		//this keyword is referring to itself! 
		this.name = s;
		this.age = a;
		this.hungry = b;
	}
	
	//Define what states the Dog can store
	public String name;
	public int age;
	public boolean hungry;
	
	//Define what the Dog can do
	
	
	

}
