package com.revature.inheritance;

public class Cat extends Animal{
	
	public Cat(String name,int age,double weight,boolean hunger) {
		super(name,age,weight,hunger); //This is me calling my parent constructor!
		
	}
	
	public Cat() {
		super("fakey fake",-2,0,false);
	}
	
	public void hunt() {
		System.out.println("I go hunting!");
	}

}
