package com.revature.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.models.User;
import com.revature.service.LibraryService;
import com.revature.service.LibraryServiceImpl;

public class MenuImpl implements Menu {
	
	private LibraryService lService = new LibraryServiceImpl();
	
	public void welcomeMessage() {
		System.out.println("Welcome to my Library application!");
		System.out.println("Are you a returning user [0] or a new user? [1]");
		
	}

	@Override
	public void startMenu() {

		Scanner sc = new Scanner(System.in);
		
		this.welcomeMessage();
		
		String option = sc.nextLine();
		
		switch(option) {
		case "0":
			loginMenu(sc);
			break;
		case "1":
			registerMenu(sc);
			break;
		default: 
			System.out.println("That's not a valid option!");
		}

	}

	private void loginMenu(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Welcome back!");
		System.out.println("Please input your username");
		String username = sc.nextLine();
		System.out.println("Please input your password");
		String password = sc.nextLine();
		
		User u = lService.login(username, password);
		
		if(u != null) {
			System.out.println("Logged in successfully!");
		}else {
			System.out.println("Not logged in!");
		}
		
	}

	private void registerMenu(Scanner sc) {
	
		System.out.println("Welcome new user!");
		System.out.println("Please put down a username:");
		String username = sc.nextLine();
		System.out.println("Please put down a password:");
		String password = sc.nextLine();
		
		User u = new User(username, password, new ArrayList<>());
		
		if(lService.register(u)) {
			System.out.println("Account created!");
		}else {
			System.out.println("Account not created!");
		}
		
		
	}

}
