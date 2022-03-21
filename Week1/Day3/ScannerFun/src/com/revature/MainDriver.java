package com.revature;

import java.util.Scanner;

import com.revature.exceptions.BusinessException;
import com.revature.model.User;
import com.revature.repo.UserRepository;

public class MainDriver {
	
	public static void welcomeMenu() {
		System.out.println("Welcome to ben's terminal!");
		System.out.println("Are you a new user [0] ");
		System.out.println("or a returning user? [1]");
		System.out.println("To quit [9]");
	}

	public static void registerMenu(Scanner sc) {
		System.out.println("Welcome new user!");
		System.out.println("Please write your username");
		String username = sc.nextLine();
		
		if(UserRepository.retrieveUserByName(username) == null) {
			System.out.println("Please write your password");
			String password = sc.nextLine();
			System.out.println("How much money do you want to put in?");
			double startingBalance = sc.nextDouble();
			
			if(startingBalance < 0) {
				System.out.println("Not allowed!");
				System.out.println("Balance is set to 0");
				startingBalance = 0;
			}
			
			User u = new User(username, password, startingBalance);
			UserRepository.addUser(u);
		}else {
			System.out.println("Username already exists!");
		}
		
		
	}
	
	public static User loginMenu(Scanner sc) {
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your password");
		String password = sc.nextLine();
		
		User loggedInUser = UserRepository.retrieveUser(name,password);
		return loggedInUser;
	}
	
	public static void prettyDisplay(User u) {
		System.out.println("Your username is: " + u.getName());
		System.out.println("Your balance is: " + u.getBalance());
	}
	
	
	public static void main(String[] args) {

		/*
		 * The Scanner is a class that always the application to read 
		 * 	user input in the terminal. 
		 */
		
		/*
		 * Ask the users to input their password as well, and check against the password 
		 * 	to see if they have access to their account!
		 * 
		 * When a user makes a new account, check if that username is unique!
		 * 
		 * Using Arrays! Make it so that there is no limit to how many users I 
		 * 	can have!
		 * 
		 * Make sure that the starting balance is greater than 0.
		 */
		
		Scanner sc = new Scanner(System.in);
	
		
		boolean active = true;
		
		while(active) {
			
			welcomeMenu();
			
			String option = sc.nextLine();
			switch(option) {
			case "0":
				registerMenu(sc);
				break;
			case "1":
				try {
					User u = loginMenu(sc);
//					System.out.println(u); //This is not a pretty way of displaying a user!
					prettyDisplay(u);
				} catch(BusinessException e	) {
					System.out.println("User credentials don't match!");
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
			case "9":
			active = false;
			break;
			default: 
				System.out.println("Invalid option!");
			}
			
		}
		
		
		

	}

}
