package com.revature.lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDriver {
	
	/*
	 * List: 
	 * 		An ordered collection (insertion order)
	 * 		May contain duplicate elements. 
	 * 		Access via index (positional access):
	 * 			.get(), .set(), .add(), indexOf(), lastIndexOf() ... etc. 
	 * 		
	 * Classes: 
	 * 		ArrayList: 
	 * 			A resizable array (mutable) compared to the Array class in java.lang.
	 * 			Add or remove elements in the data structure. 
	 * 
	 * 		LinkedList: 
	 * 		Vector (Depcreated - contains legacy methods): 
	 */

	public static void main(String[] args) {

		List<Integer> integerList = new ArrayList<>(); //we don't define size!
		integerList.add(1);
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		System.out.println(integerList);
		integerList.add(5, 37);
		integerList.add(2, 37);
//		integerList.add(22, 37); //This will not work!
		System.out.println(integerList);
		System.out.println(integerList.get(0));
		
		Set<Integer> integerSet = new HashSet<>();
		integerSet.addAll(integerList);
		System.out.println(integerSet);
		
		
		

	}

}
