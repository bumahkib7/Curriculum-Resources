package com.revature;

import com.revature.structures.BenArray;
import com.revature.structures.BenGenericArray;
import com.revature.structures.BenObjArray;

public class MainDriver {
	
	/*
	 * The Collection API in Java is a set of classes and interfaces, that implement
	 * 	commonly used data structures. A Collection is a single object which acts
	 * 	as a container for other other objects. The Collection API follows a 
	 * 	hierarchy! 
	 * 
	 * Why Collection API?
	 * 	Starting of with, we have the Array object in Java. However, the Array is 
	 * 	very limited to work with (it is immutable, does not have convenient data
	 * 	structure methods, limited to index based data structure).
	 * 
	 * 	I could create my own custom data structure! 
	 * 		It's probably not optimized!
	 * 		It'll be difficult to share the data structure between developers!
	 * 
	 * The Collection API comes in here! 
	 * 
	 * Advantages: 
	 * 	Reduces effort (provide data structures and algorithms for us)
	 * 	Increased performance (creates fine-tuned implementation of data structures)
	 * 	Encourages software reuse (provides a standard interface)
	 * 
	 * Disadvantages: 
	 * 	Does not allow primitive data types! We have Wrapper classes that resolve that!
	 * 	Wrapper class "wraps" around a primitive and makes it into a object!
	 * 	The process of turning a primitive into an object is called "autoboxing"
	 * 	int -> Integer
	 * 	double -> Double 
	 * 	byte -> Byte 
	 * 	boolean -> Boolean 
	 * 	char -> Character  (String is different to Character)
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to Collection API!");
		
		BenArray myArray = new BenArray("Apple","Kiwi","Banana");
		myArray.add("Tomatoe"); //I have a expandable data structure now!
		myArray.add("pineapple");
		System.out.println(myArray); //print out the data structure!
		
		String[] fruitArray = {"Apple","Kiwi","Banana"};
		//no easy way to add fruits to this array 
		System.out.println(fruitArray);
		
		
		int a = 1;
		Integer a2 = 1; //autoboxing
		Integer a3 = a;
//		Integer a4 = new Integer(2); deprecated! 
		
		
//		a. //nothing appears, because there are no methods
		String apple = "Apple";
		Object o = apple;
		Object o2 = a2;
		Object o3 = a3;
		
		BenObjArray myObjArray = new BenObjArray(new Object(),o,o2,o3 );
		System.out.println(myObjArray);
		
		String s1 = myArray.retrieve(0);
		s1.getClass();
		s1.charAt(1);
		
		Object s2 = myObjArray.retrieve(1);
//		s2. //don't have access to string specific methods!
		
		//We can use Generics! (hint: that's why we can't use primitives)
		//Generics are <[type] > with a Object Datatype in the middle
		//They allow us to create Classes that can take "any" type of Object but also
		// enfore type safety. so only certain objects can be added! 
		
		BenGenericArray<String> sArray = new BenGenericArray<>("apple", "tomatoe","kiwi");
		sArray.retrieve(0).charAt(0);
//		sArray.add(10); //generics enfore type safety!
		
		BenGenericArray<Integer> intArray = new BenGenericArray<>(1,2,3,4,5);
		intArray.retrieve(0).byteValue();
		
//		BenGenericArray<int> primitveArray; 
		BenGenericArray<Object> objectArray; 
		//Generics only support objects, we can't store primitives in our generic strucures!
	}
}
