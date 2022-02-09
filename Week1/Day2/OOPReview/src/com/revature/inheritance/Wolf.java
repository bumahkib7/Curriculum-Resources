package com.revature.inheritance;

public class Wolf extends Animal{
	
	public Wolf(String name,int age, double weight) {
		super(name,age,weight,true); //every instance of wolf is going to start off as hungry!
	}
	
	public Wolf() {
		super("Fakey fake",-1,-1,false);
	}
	
	public void packHunt() {
		System.out.println("I'm in hunting in a pack!");
	}

}
