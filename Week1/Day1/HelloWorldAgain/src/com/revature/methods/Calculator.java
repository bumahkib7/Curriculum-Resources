package com.revature.methods;

public class Calculator {
	
	public double e = 3.26;
	
	//Give the method a name!
	//Declare the parameters of the method (define name and datatype) !
	//Specify return type of method
	
	int minus(int basdfas, int a){
		//When minus is called, this block of code will execute.
		
		System.out.println(a + " : this value is being passed in!");
		System.out.println(basdfas + " : this value is being passed in!");
		
		
		int value = basdfas-a;
		return value;
	}
	
	double addition(double a, double b){
		//double + double = double 
		return a+b;
	}
	
	double multiplication(double a, double b) {
		return a*b;
	}

}
