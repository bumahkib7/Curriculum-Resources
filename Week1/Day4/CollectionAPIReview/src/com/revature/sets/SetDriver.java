package com.revature.sets;

import java.util.HashSet;
import java.util.Set;

public class SetDriver {
	
	/*
	 * Set?
	 * 	Every element in a set is unique! (no duplicates allowed)
	 * 	Does not guarantee insertion order
	 * 	Sets are not indexed! We can't find elements with index. 
	 * 	For a set to be equal to another set, they just to have the same elements!
	 * 
	 * 	Classes: 
	 * 		HashSet (maintains no order, stores in hash table, best performance)
	 * 		LinkedHashSet
	 * 		TreeSet 
	 */
	public static void main(String[] args) {
		
		Set<String> stringSet = new HashSet<>(); //didn't have to mention size?
		stringSet.add("Mercury");
		stringSet.add("Mercury");
		
		stringSet.add("Mercury");
		stringSet.add("Earth");
		stringSet.add("Venus");
		stringSet.add("Earth");
		
		if(!stringSet.add("Mercury")) {
			System.out.println("Mercury already exists!");
		}
		
		
		
//		System.out.println(stringSet); //toString is overriden to be more useful!
		
//		System.out.println(stringSet.); //...there is no way to directly access a sinlge object?
		
//		for(int i = 0; i< something.length ; i++) {
//			//this works if I have index based access, or at least positional access
//		}
		
		for(String s: stringSet) {
			System.out.println(s);
		}
		
		//Collection entities have very useful methods. Which the Set inherits. 
		//In fact, there is little difference between Collection and Set! 
		//Only difference is, Collection accepts duplicates! 
		
		stringSet.addAll(stringSet);
		stringSet.remove("Earth");
		
		System.out.println(stringSet.contains("Venus"));
	}

}
