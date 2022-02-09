package com.revature.abstraction;

public interface Vehicle {
	
	//by default every variable in an interface is public static final
	public static final double costOfGas = 1;
	double costOfDiesel = 1.5;
	
	//Abstraction in Java is behavior focused
	//We define the behaviors that a entity should have. 
	//In interfaces, all methods are "abstract" and "public" by default. 
	//Abstract methods do not have a concrete body 
	
	//Interfaces DO NOT have Constructors (We cannot instantiate one directly)
	//Interfaces (without a special keyword) do not have concrete methods
	//Do not have non-static members/states associated with them. 
	
	//To create an interface, we create a child class of the interface!
	//Child classes have an IS-A relationship, e.g. Cat is an animal, Toyota is a vehicle!
	
//	double accelerate(double targetSpeed);
	public abstract double accelerate(double targetSpeed);
	
	boolean startEngine();
	
	boolean brake(); //returns true or false if the vehicle brakes
//	double brake(); //returns the new speed after the brake has been applied
//	int brake(); //0 - stop, 1- slowed down, -1 = failed to brake!
	
	boolean steer(String direction); //specify direction to go to!
	
	boolean stopEngine(); 

}
