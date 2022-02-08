package com.revature.abstraction;

public class WafaVehicle implements Vehicle{

	public boolean brake() {
		System.out.println("Better implementation!");
		return true;
	}
	
	public boolean startEngine() {
		return true;
	}
	
	public boolean stopEngine() {
		return true;
	}

	@Override
	public double accelerate(double targetSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean steer(String direction) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String awesomeRadio() {
		return "Great Songs!";
	}
}
