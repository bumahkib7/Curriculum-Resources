package com.revature.polymorphism;

public class PolyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calculator c = new Calculator();
//		System.out.println(c.add(1,2));
//		
//		System.out.println(c.add(1.0,2.0,3.0,7.0,9.5));
//		System.out.println(c.add(1.0,2.0,3.0));
//		
//		c.randomMethod(0, false, "fake");
//		c.randomMethod("the other fake", 0, false);
		
		
		Animal a = new Animal();
		a.jump();
		
		Tiger t = new Tiger();
		t.jump();
		t.hunt();
		
		Animal a2 = new Tiger();
		a2.jump();
//		a2.hunt();
		
		//This won't work, because t2 sees itself as a tiger, but isn't a tiger. 
		//so it will fail when it tries to use methods that belong to the tiger class
		//e.g the hunt ability!
		
//		Tiger t2 = new Animal();
//		t2.hunt();
		
		SuperTiger st = new SuperTiger();
		st.relax();
		st.walking(100);
	}

}
