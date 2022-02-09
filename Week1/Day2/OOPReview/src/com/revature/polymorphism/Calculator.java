package com.revature.polymorphism;

//overloading example!
//Overloading means having the same method name, but a different
//set of parameters. 

//We can ONLY overload by changing the parameters, nothing else!

//We can change the datatype of the parameters (e.g. double vs double[]);
//We can also the change the number of arguments
//We can change the order of the parameters!

//Overloading is an example of compile time polymorphism!

public class Calculator {
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public String add(String x, String y) {
		return x + y;
	}
	
	public double add(double x, double y, double z) {
		return x + y;
	}
	
	public double add(double...arrayOfDoubles ) {
		
		double total = 0;
		for(int i = 0;i<arrayOfDoubles.length;i++) {
			total+= arrayOfDoubles[i];
		}
		return total;
	}
	
	public void randomMethod(String a, double x, boolean b) {
		System.out.println("Method 1");
	}
	
	public void randomMethod(double x, boolean b, String a) {
		System.out.println("Method 2");
	}

}
