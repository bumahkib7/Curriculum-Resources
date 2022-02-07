package com.revature.methods;

public class MethodsExamples {
	
	public void randomMethod(String s) {
		//don't need to return, because of void return type.
		System.out.println(s + " apple");
	}
	
	/*
	 * Function?
	 * 	part of the code, which has a name, we can call it from other
	 * 	parts of the code and the other application and can return 
	 * 	value. 
	 * 
	 * Method?
	 * 	Method is a function, that is associated with an object.
	 * 	We need an object to use the function stored in the object! 
	 */
	
	public static void main(String[] args) {
		
		
		//I can utilise methods from other classes! 
		
//		Calculator.minus(2,2); //a blueprint won't work! 
		
		//When we create a object, we use the "new" keyword!
		//Objects are based of Classes, Classes define the object. 
		//(Think of Classes as blueprints or recipes for objects)
		
		
		Calculator calc = new Calculator(); //we need to create the object first!
		
		int minusTotal = calc.minus(2000001, 2000);
		double addTotal = calc.addition(100, 25.2);
		double product = calc.multiplication(addTotal, calc.addition(100, 25.2));
		//double product = calc.multiplication(125.2,125.2);
		System.out.println(product);
		
		
		MethodsExamples me = new MethodsExamples();
		me.randomMethod("hello");
		
		
	}

}
