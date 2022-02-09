package com.revature.models;

public class Animal {
	
	public static boolean alwaysHungry = true;
	
	private final String name;
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	public final void jump() {
		System.out.println("I'm jumping!");
	}
	
	public static void staticMethod() {
		//Ssytem.out.println(this.name); ??
		System.out.println("I'm in a static method!");
	}
	
	public void nonStaticMethod() {
		System.out.println(this.name);
		System.out.println("I'm in a normal method!");
	}

}
