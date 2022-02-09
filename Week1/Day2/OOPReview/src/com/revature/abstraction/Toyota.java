package com.revature.abstraction;

public class Toyota implements Vehicle{

	@Override
	public double accelerate(double targetSpeed) {
		// TODO Auto-generated method stub
		return targetSpeed;
	}

	@Override
	public boolean startEngine() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean brake() {
		// TODO Auto-generated method stub
		System.out.println("Toyota implementation of brake!");
		return true;
	}

	@Override
	public boolean steer(String direction) {
		// TODO Auto-generated method stub
		System.out.println("The car went this way: " + direction);
		return true;
	}

	@Override
	public boolean stopEngine() {
		// TODO Auto-generated method stub
		return true;
	}

		//With a child class of an interface, the child class must implement
		//the methods defined in the vehicle.
	
	
}
