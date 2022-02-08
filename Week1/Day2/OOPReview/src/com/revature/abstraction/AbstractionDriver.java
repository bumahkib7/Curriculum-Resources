package com.revature.abstraction;

/*
 * Abstract Class vs Interface:
 * 
 * Interface is FULL abstraction: we completely hide all the implementation, e.g. all the 
 * 	methods are abstract!
 * 
 * Abstract Classes are PARTIAL abstraction: we can hide some of the implementation, 
 * 	but still have control over how some of the methods are implemented.
 * 	(Abstract classes behave a lot like classes) 
 */

public class AbstractionDriver {

	public static void main(String[] args) {

//		Vehicle v;
//		
////		v = new Vehicle(); //does not work, interfaces don't have constructors!
//		v = new Toyota(); 
//		
//		v.brake();
//		v.accelerate(100);
//		
//		v = new WafaVehicle();
//		v.brake();
//		v.accelerate(100);
//		
//		v = new JaguarCar();
//		v.brake();
//		v.accelerate(100);
		

		//When we declare a datatype for our variable, it cannot see itself beyond 
		//that. It will only follow the methods that were declared in its interface/class!
		Truck t = new ToyotaTruck();
		Vehicle v = new ToyotaTruck();
		ToyotaTruck tt = new ToyotaTruck();
		
		t.startEngine();
		t.stopEngine();
		t.carryLotsOfThings(100);
//		t.brake();
//		t.accelerate(100);
		
		v.startEngine();
		v.stopEngine();
//		v.carryLotsOfThings(100);
		v.brake();
		v.accelerate(100);
			
		tt.startEngine();
		tt.stopEngine();
		tt.carryLotsOfThings(100);
		tt.brake();
		tt.accelerate(100);
		
		AbstractBike ab = new BMWBike();// still can't instantiate abstract classes!
		

	}

}
