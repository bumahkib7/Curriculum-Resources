package com.revature.scopes;

import com.revature.methods.Calculator;

public class MyScopes {
	
	public static double pi = 3.14; //class scope variable!
	
	/*
	 * variables scopes?
	 * 	scopes define where a variable "exists"
	 * 	4 different types of scopes 
	 * 
	 * 	Narrower (or smaller) scopes can still access parent scopes!
	 * 
	 * 	Class Scope: 
	 * 		Variable can be referenced anywhere within the class! 
	 * 
	 * 	Instance/Object:
	 * 		Variables that can be referenced within the object!
	 * 
	 * 	Method :
	 * 		Variable can only be referenced within the method!
	 * 
	 * 	Block : 
	 * 		Variables can only be referenced within the block!
	 * 	
	 * 	
	 */
	
	public void notMainMethod(int a) { 
		//parameters can have the same name as other parameters in different methods
		
		String myString = "Hello!";
//		String myString = "Goodbye!"; This will not work, 
//									because myString already exists here!
		System.out.println(myString);
		System.out.println(pi);
	}
	
	public void notMainMethod2(int a) {
		String myString = "Hello!";
//		String myString = "Goodbye!"; This will not work, 
//									because myString already exists here!
		System.out.println(myString);
		System.out.println(pi);
	}
	
	public static void main(String[] args) {
		
		boolean bool = true;
		if(bool) {
			String s = "Expression is true!";
			//s only exists within the block scope!
			System.out.println(s);
			System.out.println(bool);
		}
		
//		System.out.println(s); //will not work, outside the scope
		System.out.println(bool);
		
		Calculator calc = new Calculator();
		System.out.println(calc.e);
	}

}
