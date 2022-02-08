package com.revature.encapsulation;

public class EncapsulationDriver {
	
	public static void main(String[] args) {
		User u = new User();
		u.name = "bob";
		u.setMembership(true);
		u.setName("Bobby McBobby");
//		u.password = "pass";
		
		System.out.println(u.getName());
//		System.out.println(u.password);
		System.out.println(u.getMembership());
//		
//		
		u.setName("fakey fake");
		u.setMembership(false);
		//Dangerous operations ^^ 
		//Modifiying the user object without going through the proper channels!
	}

}
