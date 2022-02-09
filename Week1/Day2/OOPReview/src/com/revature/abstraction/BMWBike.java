package com.revature.abstraction;

public class BMWBike extends AbstractBike implements Vehicle{

	@Override
	public boolean steer(String direction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean startEngine() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double accelerate(double targetSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean stopEngine() {
		// TODO Auto-generated method stub
		return false;
	}

}
