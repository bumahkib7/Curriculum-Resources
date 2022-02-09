package com.revature.polymorphism;

public class Tiger extends Animal{

	public void hunt() {
		System.out.println("I'm an apex predator and I go hunting now!");
	}
	
	//@stuff are annotations, and they provide meta data to the JVM!
	//In this case @Override tells the JVM that this method should be overriding
	// a parent method (but is not necessary to override)
	@Override
	public void jump() {
		//completely replace parent code!
		System.out.println("I can super jump up trees!");
	}
	
	//When we override our methods, they cannot be more restrictive with access
	//but we can make it more public!
	//When oeverriding, cannot change the return type of the method
	// (unlike in overloading)
	@Override
	public double walking(double time) {
		//add to my parents code!
		
		super.walking(time); //reusing my parent's methods
		//because a tiger burns a lot of calories
		this.weight = this.weight - 10;
		System.out.println("Burning those extra calories cause I'm a tiger!");
		return this.weight;
	}
}
