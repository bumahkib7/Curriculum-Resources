package com.revature.structures;

//v0.1 is only going to store Strings!
public class BenArray {
	
	//reuse array, within my data structure!
	private String[] stringArray;
	
	//create data structure
	public BenArray() {
		stringArray = new String[1];
	}
	
	public BenArray(String...strings) {
		stringArray = strings;
	}
	
	//insert item 
	public boolean add(String newString) {
		
		boolean success = false;
		//check if there is free space! 
		for(int i = 0;i< stringArray.length;i++) {
			if(stringArray[i] == null) {
				stringArray[i] = newString;
				success = true; //there was free space
				break;
			}
		}
		
		if(!success) { //there was no space!
			String[] newArray = new String[2*stringArray.length];
			System.arraycopy(stringArray, 0, newArray, 0, stringArray.length);
			stringArray = newArray;
			
			this.add(newString);
			success = true;
		}
		
		return success;
	}
	
	// retrieve items! 
	public String retrieve(int index) {
		return stringArray[index];
	}
	
	public int findIndex(String s) {
		return 0;
	}
	
	//toString, prettier display.
	@Override
	public String toString() {
		for(String s: stringArray) {
			System.out.println(s);
		}
		return "";
	}
}
