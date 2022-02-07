package com.revature.primitives;

public class Primitives {
	
	/*
	 * What are primitives?
	 * 	Are very simple datatypes in Java. 
	 * 	So simple that they can be characterized by their memory. 
	 * 	Primitives store only a single value!
	 * 	
	 * e.g. 
	 * 	float - 4 bytes
	 * 	boolean - 1 byte
	 * 	double - 8 bytes 
	 * 	long - 8 bytes
	 * 	int - 4 bytes
	 * 	short - 2 bytes
	 * 	byte - byte of storage (8 bits) 
	 * 	char - 2 byte
	 */
	
	public static void main(String[] args) {
		
		//Java is Stronlgy typed, so we have to declare variables. 
		
		//Think of a variable as a storage or a marker for a object or primitve. 
		
		int a = 1; //python, we don't need to assign a data ttype when we declare a variable!
		
		//Whenever we declare a variable, we need to give it a datatype. 
		//variables cannot be redeclared!
		
		double b = 2.0;
//		boolean b = true;
		
		//Once a datatype has been declared, the variable cannot change!
		
//		boolean c = true;
//		c = 3;
//		c = 'a';
//		c = 40000000;
//		c = false; //variables can be reassigned a new value, but the value must be the same datatype.
		
		
		//some variables can be stored in other variables, depending on datatype.
		
		int intVariable = 37;
		double doubleVariable; //not all variables have to be assigned straight away 
		
		doubleVariable = 37; //
		
//		intVariable = 37.0; //the number is now a double! so I can't store this in an int variable!
		
//		System.out.println(intVariable);
//		System.out.println(doubleVariable);
		
		
		int i = 300;
		double d = 2.0;
		char c = 'a'; //char has single exclamation value, and can only store a single character
		byte bite = 100; //very limited storage capacity!
		long l = 30000000000l;
		short s = 32;
		float f = 2.0f;
		boolean bool = false;
		String string = "A string"; //THIS IS NOT A PRIMITVE, it's an Object
		
		System.out.println(c + c); //The char indexes all possible characters!
		System.out.println(bite + bite);
		
		
		
		
	}

}
