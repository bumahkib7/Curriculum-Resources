package com.revature.datastructures;

public class ArrayExample {
	
	public static void main(String[] args) {
		/*
		 * An Array is Java's most basic data structure. 
		 * It is an object designed to store other objects and primitives. 
		 * Arrays are indexed and immutable (cannot be resized)
		 * 
		 */
		
		int a = 1;
		int[] arrayOfInts = {1,2,3,4,5,6};
		
		//Once an array has been created, we can access values via index
		
		System.out.println(arrayOfInts[0]);
		System.out.println(arrayOfInts[1]);
		System.out.println(arrayOfInts[3]);
		System.out.println(arrayOfInts[5]);
		
		//Arrays can also be declared and intialized as empty values!
		
		boolean[] booleanArray = new boolean[10];
		//we've created an array with 10 spaces init!
		
		booleanArray[0] = true;
		booleanArray[1] = true;

		System.out.println(booleanArray[0]);
		//If I want to create an array with 20 positions, I have to 
		// rewrite and create a brand new array!
		
		booleanArray = new boolean[20];
		System.out.println(booleanArray[0]);
		
		
		double[] doubleArray = new double[33];
		doubleArray[11] = 3000;
//		doubleArray[12]	= false; //array can only store the same datatype!
		System.out.println(doubleArray[11]);
		
		String[] stringArray = new String[20];
		Object[] objectArray = new Object[11];
		
		
		//multi dimensional array
		String[][][] multiArray = new String[10][20][30];
		
		multiArray[0][0][0] = "a value!";
		
		
		
	}

}
