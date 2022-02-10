package com.revature.structures;

//No type safety with using a object array! 
public class BenObjArray {
	//reuse array, within my data structure!
		private Object[] objectArray;
		
		//create data structure
		public BenObjArray() {
			objectArray = new Object[1];
		}
		
		public BenObjArray(Object...objects) {
			objectArray = objects;
		}
		
		//insert item 
		public boolean add(Object newObject) {
			
			boolean success = false;
			//check if there is free space! 
			for(int i = 0;i< objectArray.length;i++) {
				if(objectArray[i] == null) {
					objectArray[i] = newObject;
					success = true; //there was free space
					break;
				}
			}
			
			if(!success) { //there was no space!
				Object[] newArray = new Object[2*objectArray.length];
				System.arraycopy(objectArray, 0, newArray, 0, objectArray.length);
				objectArray = newArray;
				
				this.add(newObject);
				success = true;
			}
			
			return success;
		}
		
		// retrieve items! 
		public Object retrieve(int index) {
			return objectArray[index];
		}
				
		//toString, prettier display.
		@Override
		public String toString() {
			for(Object o: objectArray) {
				System.out.println(o);
			}
			return "";
		}
}
