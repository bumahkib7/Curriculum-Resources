package com.revature.polymorphism;

public class SuperTiger extends Tiger{
	
	@Override
	public void relax() {
		super.relax(); //super only refers to the direct parent! Tiger class methods
	}
	
	@Override
	public double walking(double time) {
		return super.walking(time);
	}

}
