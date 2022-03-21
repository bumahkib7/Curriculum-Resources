package com.revature;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDriver {
	
	/*
	 * Map: 
	 * 	Stores items in 'key' and 'value' pairs (also known as dictionary)
	 * 	Each key has to be unique and can be mapped to one a single value. 
	 * 	(note: a key can be mapped to duplicate values)
	 * 
	 * Method: 
	 * 	.put(), .get(), .remove(), .contiansKey(), ... etc. 
	 * 
	 * Classes: 
	 * 	HashMap: 
	 * 		Allows duplicate values, not duplicate keys.
	 * 		Allowed to have a single null key!
	 * 		Does not guarantee insertion order. 
	 * 	TreeMap: 
	 * 	LinkedHashMap (child of HashMap): 
	 */

	public static void main(String[] args) {

		Map<Integer,String> intStringMap = new HashMap<>();
		intStringMap.put(1, "Mercury");
		intStringMap.put(2, "Venus");
//		intStringMap.put(2, "Earth"); //we just replace the  "value" of the same key.
//		intStringMap.put(3, "Venus"); //just duplicates the value
		intStringMap.put(3, "Earth");
		intStringMap.put(-1, "Pluto");
//		intStringMap.put(null, "fakey fake");
		
		System.out.println(intStringMap);
		
		Set<Integer> keySet = intStringMap.keySet();
		Collection<String> valueSet = intStringMap.values();
		
		
		//example of unboxing! 
		//primitives cannot store null values, so that's why removed the null key!
//		for(int i: keySet) {
//			System.out.println(i);
//			System.out.println(intStringMap.get(i));
//		}
//		
//		for(String s: valueSet) {
//			System.out.println(s);
//		}
		
		for(Entry<Integer, String> s: intStringMap.entrySet()) {
			System.out.println(s);
		}
		
		//Weird data structures
		Map<Map<Set<Integer>,String>,Collection<Collection<Set<Collection<String>>>>> random = new HashMap<>();
		random.put(null, null);
		
		
	}

}
