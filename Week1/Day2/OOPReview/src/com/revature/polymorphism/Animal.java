package com.revature.polymorphism;

public class Animal {
	
	public Animal(String name,int age,double weight, boolean hunger) {
		super();
//		age = age; //this doesn't works because, the smaller scope variable has priority!
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.hunger = hunger;
	}
	
	public Animal() {
		super();
	}
	
	public String name;
	public int age;
	public double weight;
	public boolean hunger;
	
	public void jump() {
		System.out.println("basic jumping");
	}
	
	public void relax() {
		System.out.println("I'm relaxing!");
	}
	
	public double walking(double time) {
		System.out.println("Burning those calories!");
		this.weight = this.weight - time*0.1;
		return this.weight;
	}

}
