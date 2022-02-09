package com.revature.inheritance;


/*
 * Inheritance is one of the most important aspects of OOP, allow you to inherit 
 * 	methods and variables from parent classes; this promotoes code reuse
 * 
 * For homogenous inheritance we use the keyword: "extends"
 * 	class -> class 
 * 	Abstract class -> class
 * 	Class -> Abstract Class ? 
 * 	Interface -> Interface ?
 * 
 * For hetrogenous inheritance we use the keyword: "implements"
 * 	Class -> Interface ?
 * 	interface -> class
 * 
 * Child classes have access to their parent classes (but not the other way around).
 * Child class can only extend a single class! But multilevel inheritance is allowed!
 * 
 * A -> B -> C 
 * 
 * We do not inherit constructors! Instead we call our parent constructors! 
 */
public class InheritanceDriver {
	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.jump();
		a.walking(100);
		a.relax();
//		a.hunt();
		
		Cat c = new Cat();
		c.jump();
		c.walking(100);
		c.relax();
		c.hunt();
		
		Wolf w = new Wolf();
		w.jump();
		w.walking(0);
		w.relax();
		w.packHunt();
	}

}
