package com.revature;

import com.revature.models.Animal;
import com.revature.models.Squirrel;

public class MainDriver {
	
	
	/*
	 * Access Modifiers: 
	 * 		public 
	 * 		protected
	 * 		package (implicit)
	 * 		private 
	 * 
	 * 		Will control which packages and classes have access to variables and 
	 * 		methods. (Used to achieve encapsulation)
	 * 		Access modifiers are used in variables, constructors, methods and classes.
	 * 
	 * 		Can I have a private class?
	 * 			private means that only the class that has the variable or method
	 * 			have access. 
	 * 			No! We cannot have private classes (that aren't nested) or protected. 
	 * 			Just public or package classes. 
	 * 
	 * Non-access modifiers: 
	 * 		keywords that we can put in front of classes, methods and variables to 
	 * 		modify their default behavior. 
	 * 
	 * 		abstract: 
	 * 			used in front of a class or a method!
	 * 
	 * 		default: 
	 * 		synchronous:
	 * 
	 * 		final: 
	 * 			will make an entity immutable. 
	 * 			variable: It's like a constant, cannot be reassigned a new value!
	 * 			method: we cannot override the method!
	 * 			class: we cannot inherit the class (no longer extendable).
	 * 			can we have a final interface???
	 * 			can we have a final abstract method???
	 * 
	 * 		e.g. examples of Final.
	 * 			url to your database! 
	 * 			final class would be the String class! 
	 * 		
	 * 		static: 
	 * 			static methods and variables allow us to use them without having 
	 * 			to instantiate an object itself! 
	 * 			static means that it belongs to the Class not the object. 
	 * 
	 * 			//Can a static method use a non static variable?
	 * 
	 * 			variables: 
	 * 			methods: 
	 * 			(nested) classes
	 * 			
	 */
	
	public void main(String[] apples) {
//		Fruit apple = new Fruit(); //Why have a private constructor
		
		final int i = 1;
		
		
		Squirrel s = new Squirrel("Bobby");
		s.nonStaticMethod();
		s.jump();
		s.staticMethod(); //This is not good pracitce. 
		//Static methods should be accessed statically, that means 
		//accessing via the Class. 
		
		Squirrel.staticMethod();
//		a.jump();
//		a.nonStaticMethod();
		Animal.staticMethod();
		
		
		
		
	}

}
