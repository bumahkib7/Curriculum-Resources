package com.revature.structures;

//Generics look like angle brackets with an object type
public class BenGenericArray<T> {
	
	private T[] genericArray;
	
	public BenGenericArray(){
		
	}	
	
	public BenGenericArray(T...ts){
		genericArray = ts;
	}
	
	public boolean add(T t) {
		return false;
	}
	
	public T retrieve(int index) {
		return genericArray[index]	;
	}

}
