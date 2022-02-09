package com.revature;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.revature.exceptions.CustomException;

public class MainDriver {
	
	public static void riskyMethod(int i, int j) throws ArithmeticException{

		if(j == 0) { //== is fine with primitives, use .equals() when using objects!
			throw new ArithmeticException();
		}else {
			int total = i/j; //This line of code will throw an exception
			//The exception, if not handled, will stop the application at that line. 
			//Will print out a stack trace, where the exception occured!
			System.out.println(total);
		}
		
		
		
		
	}

	public static void otherRiskyMethod() throws NullPointerException{
		
		throw new NullPointerException(); //This means that the code will always throw an exception!
		
	}
	
	public static void throwsCheckedExceptions() throws IOException{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 0;
//		int j = 1;
//		
//		int total = j/i; //This line of code will throw an exception
//		//The exception, if not handled, will stop the application at that line. 
//		//Will print out a stack trace, where the exception occured!
		
//		otherRiskyMethod();
		
		
		try {
			//code here will execute
			//We want to put this code in a try catch block
//			throwsCheckedExceptions();
//			otherRiskyMethod();
//			riskyMethod(3,2); //this method is risky!
//			riskyMethod(3,7);
//			riskyMethod(22,0);
			
//			throw new FileNotFoundException();
			
		
//			throw new AbstractMethodError();
			
			throw new CustomException("something happened here!");
			
			
		} catch(ArithmeticException e) {
			//this code will execute if the try block throws an exception!
			System.out.println("Don't put the number 0!!!!!!!");
//			e.printStackTrace();
			
		} catch(NullPointerException e) {
			//When we write seperate exception handles
			// We know excactly what happened!
			
			e.printStackTrace();
		} catch(Exception e) {

			//If a arithmiticException is thrown, it will be catched by this block!
			//Exception should be at the bottom, to catch any other exception that wasn't caught!
			e.printStackTrace();
		} catch(Error e) {
			//can't do anything with errors. 
		} catch(Throwable t) {
			//this will catch exception and error. 
			//I can't do anything if an error was thrown!
		}
		
		
		/*
		 * checked vs unchecked exceptions!
		 * 
		 * 		They are define by their relationship to the Exception heirarchy!
		 * 
		 * 		Checked exception is a direct child class of Exception. 
		 * 
		 * 		Unchecked exception is a direct child of RuntimeException. 
		 * 			(And also a indirect, grandchild of Exception Class)
		 * 
		 * 		Checked exceptions FORCE us to handle them!
		 * 		Unchecked exceptions don't force us to handle them (but we should still
		 * 			handle them) 
		 */
		
		/*
		 * Error vs Exception?
		 * 		Exceptions are when issues/problems occur due to code.
		 * 		We can write logic or handle issues with code that has been caused
		 * 		by code. 
		 * 
		 * Error: 
		 * 		System or hardware failure. 
		 * 		For example, if my RAM runs out of memory or I hit my computer
		 * 		with a hammer. 
		 * 
		 * 		We don't want to catch Errors! WE CAN! WE JUST SHOULDN'T!
		 * 
		 * Throwable: 
		 * 		Is the parent class of Exception and Error, and what allows them 
		 * 		to be "thrown".
		 */
		
		System.out.println("Finished!");

	}

}
