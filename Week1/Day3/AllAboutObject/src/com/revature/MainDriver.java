package com.revature;

import com.revature.models.Animal;
import com.revature.models.User;

public class MainDriver {
	
	public static void main(String[] kiwi) {
		
//		System.out.println("Hi there!");
		
		User u = new User();
		u.setUsername("McBobby");
		u.setPassword("pass");
		
		User u2 = new User("NotBobby", "ssap");
		
		User u3 = new User("McBobby", "anything!"); //u and u3 are pointing to 2 different objects!
		
		Object o = new Object();
		
		String s = "test";
		
		System.out.println(u);
		System.out.println(u2);
		System.out.println(u3);
		
		System.out.println(u.equals(o));
		System.out.println(u.equals(s));
		System.out.println(u.equals(u3));
		System.out.println(u.equals(u2));
		
		
		/*
		 * Object Class: 
		 * 		Object class is the root class for every object in Java
		 * 		Every single class is either directly or indirectly a child 
		 * 			of Object. (e.g. User is a direct child, Animal is indirect)
		 * 		Object is a part of the java.lang package. 
		 * 		(anything in the java.lang package does not need to be imported!)
		 * 
		 * 		
		 * 		With the Object class we get a few methods that are quite important!
		 * 		
		 * 		.toString():
		 * 			To return the String representation of the Object. 
		 * 			Inside of System.out.println(), we implicilty call the toString method!
		 * 			From the Object class, the .toString will return the hashcode representation
		 * 			of the object. 
		 * 	
		 * 		.equals():
		 * 			From the Object class, it compares memory location!
		 * 
		 * 		.hashCode():
		 * 			Returns a hashcode that can be used when storing the object in 
		 * 			a HashMap
		 * 
		 * 		All the other methods are related to threading
		 * 			
		 * 		
		 */
		
//		Object o1 = new User();
//		Object o2 = new Animal();
	}

}
