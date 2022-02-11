package com.revature;

import com.revature.model.Fruit;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitves follow a pass by value 
		int a = 1;
		int b = a; //this is the same as int b = 1;
		
		b = 27;
		System.out.println(a);
		
		//Pass by reference
		Fruit apple = new Fruit("Apple");
		Fruit f2 = apple; 
		
//		f2 = new Fruit("Kiwi"); //We are reassigning the reference variable!
		f2.setName("Kiwi");
		System.out.println(apple);
		System.out.println(f2);
		
		
//		We can do the below code because of Grabage collection.
//		Otherwise our system would run out of memory!
//		while(true) {
//			System.out.println("new object created!");
//			Object o = new Object();
//		}
		
		
		
	}

}
