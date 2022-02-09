package com.revature.models;

public interface Calculator {
	
	final static double CONST_PI = 3.14;
	final static double CONSTANT_E = 3.26;
	int NUMBER_OF_SIDES_IN_A_TRIANGLE = 3;
	
	double add(double x, double y);
	
	double add(double...ds );
	
	double minus(double x, double y);

}
