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
		
		if(a > b) {
			System.out.println("a is greater than b");
		} else if(a < b) {
			System.out.println("a is less than b");
		}else if(b == a) {
			System.out.println("a is equal to b");
		}else {
			System.out.println("I have no idea what happened!");
		}
		
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
	}

}
