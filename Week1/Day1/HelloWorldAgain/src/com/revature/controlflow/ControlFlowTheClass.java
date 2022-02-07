package com.revature.controlflow;

public class ControlFlowTheClass {
	
	public static void main(String[] args) {
		
		/*
		 * Control flow statements?
		 * 		Will affect the flow of how your code will be executed. 
		 * 		Sometimes we want to repeat blocks of code or ignore it, 
		 * 		we can do this based on a condition!
		 * 
		 * 	Examples: 
		 * 		if and else if statements
		 * 		switch 
		 * 		for (traditional loop)
		 * 		for each loop
		 * 		while 
		 * 		do while 
		 * 		
		 */
		
		boolean bool1 = false;
		boolean bool2 = false;
		boolean bool3 = false;
		
		int a = 56;
		int b = 56;
		
//		if(a > b) {
//			System.out.println("a is greater than b");
//		} else if(a < b) {
//			System.out.println("a is less than b");
//		}else if(b == a) {
//			System.out.println("a is equal to b");
//		}else {
//			System.out.println("I have no idea what happened!");
//		}
		
		/*
		 * A condition being met means that <conditional statement> = true
		 * 
		 * if(<conditional statement>){
		 * 	This block of code will execute if condition has been met!
		 * } else if(<2nd conditional statement>){
		 * 	This block of code will execute ONLY if the first condition has not
		 * 	been met, and the 2nd condition has been met!
		 * }
		 */
		
		/*
		 * Switch Statement: 
		 * 	Switch is similar to if and else if, but is used to compare
		 * 	expressions. 
		 * 	Switch will take in a int or a String
		 * 
		 * Switch is not designed for mathematical operatiosn!
		 * 	There is no easy way of doing a greater than or less tahn operation!
		 */
		
		int favoriteNumber = 13;
		
		switch(favoriteNumber) {
		case 10:
			System.out.println("Your favorite number is 10");
			break;
		case 12:
			System.out.println("Your favorite number is 12");
			break; //exits out of the switch block!
		case 97:
			System.out.println("Your favorite number is 97");
			break;
		default:
			System.out.println("I have no idea what your favorite is!");
		}
		
		String favoriteColor = "blue";
		
		switch(favoriteColor) {
		case "blue":
			System.out.println("Your favorite color is blue");
			break;
		case "red":
			System.out.println("Your favorite color is red");
			break;
		default:
			System.out.println("No favorite!");
		}
		
		//Extra!
//		
//		double favoriteDouble = 2.0;
//		switch(favoriteDouble) {
//			//Why does this not work?
//		}
		
		
		
		/*
		 * While loop?
		 * 	keep repeating as long as a condition has been met!
		 * 
		 * while(<condition){
		 * }
		 * 
		 * Do While loop?
		 * 	Checks for the boolean expression after the first loop!
		 * 	That means, that it will loop at least once!
		 */
		boolean myBool = true;
		int number = 0;
//		while(number < 1000) {
//			
////			number = number + 1; //same thing
////			number+= 2; //same thing
//			number++;  //same thing 
//			
//			System.out.println(number);
//			
//			//we can have control flow blocks within clontrl blocks.
//			
//			if(number == 750) {
//				System.out.println("We've reached 750");
//				break;
//			}
//		}
		
//		while(false) {
//			//Will never execute!
//		}
		
		int loops = 0;
//		do {
//			loops++;
//			System.out.println("Execute at least once!");
//			if(loops == 26) {
//				myBool = false;
//				//This is allowed because this block is in a smaller scope!@
//			}
//			
//		}while(myBool);
		
		
		//For Loop
		// We have 3 conditions instead of the one condtion in while loop
		//Starting condition
		//Terminating Condition
		//Iterating condition
		//for(starting;terminating;iterating)
		
		//For loop is best designed to arrays or iterating through data structures!
		for(int i = 0;i< 10;i++) {
			System.out.println(i);
		}
		
		for(int i = -1000;i< 1000;i = i + 100) {
			System.out.println(i);
		}
		
		int[] intArray = new int[10];
		
		for(int i = 0; i< 10; i++) {
			intArray[i] = 22;
			System.out.println(intArray[i]);
		}
		
		
		/*
		 * Review the for each loop!
		 * for each and traditional for loop!
		 * 
		 * Why can't the switch statement take in a double!
		 * 
		 * In my calculator I can only take in 2 values for each method
		 * , give me a parameter and logic that can add up 0 - infinite numbers!
		 */
		
		
	}

}
