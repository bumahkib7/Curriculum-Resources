package com.revature.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.models.User;
import com.revature.service.LibraryService;
import com.revature.service.LibraryServiceImpl;

public class MenuImpl implements Menu {
	
	private static User loggedInUser;
	
	private LibraryService lService = new LibraryServiceImpl();
	
	public void welcomeMessage() {
		System.out.println("Welcome to my Library application!");
		System.out.println("Are you a returning user [0] or a new user? [1]");
		System.out.println("Quit the application [9]");
	}

	@Override
	public void startMenu() {

		Scanner sc = new Scanner(System.in);
		boolean active = true;
		
	while(active) {
		this.welcomeMessage();
		
		String option = sc.nextLine();
		
		switch(option) {
		case "0":
			if(loginMenu(sc)) {
				userMenu(sc);
			};
			break;
		case "1":
			registerMenu(sc);
			break;
		case "9":
			active = false;
			break;
		default: 
			System.out.println("That's not a valid option!");
		}
	}
		

	}

	private void userMenu(Scanner sc) {

		System.out.println("Here are your options:");
		System.out.println("[1] For viewing all avaialable books");
		System.out.println("[2] For viewing my books");
		System.out.println("[3] Withdraw a book");
		System.out.println("[4] Deposit a book!");
		System.out.println("[5] See all books!");
		
		String userMenuOption = sc.nextLine();
		
		switch(userMenuOption) {
		case "1":
			System.out.println(lService.getAllAvailableBooks());
			break;
		case "2":
			System.out.println(loggedInUser.getMyBooks());
			break;
		case "3":
			String bookTitle = sc.nextLine();
			lService.withdraw(loggedInUser, null);
			break;
		case "4":
			String depositBookTitle = sc.nextLine();
			lService.deposit(loggedInUser, null);
			break;
		case "5":
			System.out.println(lService.getAllAvailableBooks());
		default: 
			System.out.println("That's not a valid option!");
		}
		
	}

	private boolean loginMenu(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Welcome back!");
		System.out.println("Please input your username");
		String username = sc.nextLine();
		System.out.println("Please input your password");
		String password = sc.nextLine();
		
		User u = lService.login(username, password);
		
		if(u != null) {
			System.out.println("Logged in successfully!");
			loggedInUser = u;
			return true;
		}else {
			System.out.println("Not logged in!");
			return false;
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
			System.out.println("Probably because the username already exists!");
		}
		
		
	}

}
