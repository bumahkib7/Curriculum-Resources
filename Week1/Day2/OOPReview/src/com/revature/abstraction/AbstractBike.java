package com.revature.abstraction;

//To make a class abstract, we use the abstract keyword!
//Abstract class is similar to a Class
//Abstract classes have constructors!
//Abstract classes can have states!
//Abstract classes can have methods!

//Abstract classes can have 0 or more abstract methods
//Abstract classes cannot be instantiated directly!
//Abstract classes can be only extended one at a time, like classes!
public abstract class AbstractBike {

	public double speed;
	
	public AbstractBike() {
		super();
	}
	
	public void accelerate(){
		this.speed++;
	}
	
	public boolean brake() {
		this.speed--;
		return true;
	}
	
	public abstract boolean steer(String direction);
	public abstract boolean startEngine();
}
