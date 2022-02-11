package com.revature;

/*
 * String API (java.lang)
 * 
 * String is an object that contains an array of characters! 
 * 	It allow simple and easy to use methods to create and 
 * 	manipulate strings. 
 * 
 * String is a special class in Java! String class is immutable and
 * 	final.
 * 	final: The class cannot by extended
 * 	immutable: The string cannot be changed! 
 * 
 * (A string cannot be modified, instead when we thing we're modifying it
 *  we're actually creating a brand new string in the heap!)
 *  
 *  String Objects vs String Literals:
 *  	Strings literals are stored in the String pool
 *  
 *  When a new String Object is created, it checks to see if the String 
 *  pool already has the String literal value. If yes, then it points to that
 *  value, if not then it creates a new instance of the String literal
 *  in the pool. 
 *  
 *  
 *  String vs StringBuffer vs StringBuilder!
 */

public class MainDriver {
	
	public static void main(String[] args) {
		
//		Examples of immutableness: 
		
//		1)
//		String a = "Apples";
//		String b = a;
//		b.toUpperCase();
		
//		2)
//		String a = "Apples";
//		a.toUpperCase();
		
//		a = a.toUpperCase();
//		
//		System.out.println(a);
		
		String s = new String("Example String");
		String s2 = new String("Example String");
		
		System.out.println(s == s2); //bad idea, only compares location!
		System.out.println(s.equals(s2)); //this will check contents!
		/*
		 * We declare String objects in a weird way!
		 * 	We often don't use the new keyword! Why is that?
		 */
		
		
		
	}

}
