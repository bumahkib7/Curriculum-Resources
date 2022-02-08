package com.revature.abstraction;

public class ToyotaTruck implements Truck, Vehicle{

	@Override
	public boolean startEngine() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stopEngine() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean carryLotsOfThings(double weight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double accelerate(double targetSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean brake() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean steer(String direction) {
		// TODO Auto-generated method stub
		return false;
	}

}
