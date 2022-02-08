package com.revature;
//import com.revature.models.*;
import com.revature.models.Dog;

public class MainDriver {
	
	public static void main(String[] args) {
		System.out.println("Welcome to OOP review!");
		
		Dog coco; //I haven't created a instance of a dog!
					//I've declared a variable, that can store a dog. 
		
		coco = new Dog();
		coco = new Dog(1,"Coco",true);
		
		System.out.println(coco.name);
		System.out.println(coco.age);
		System.out.println(coco.hungry);
		
		Dog mcDoggy = new Dog(11,"McDoggy",false);
		System.out.println(mcDoggy.name);
		System.out.println(mcDoggy.age);
		System.out.println(mcDoggy.hungry);
		
		Dog dog1 = new Dog(2,"Lulu",true);
		
		Dog[] dogArray = new Dog[4];
		dogArray[0] = dog1;
		dogArray[1] = mcDoggy;
		dogArray[2] = coco;
		dogArray[3] = coco;
		
		for(int i = 0; i< dogArray.length; i++) {// traditional for loop
			System.out.println(dogArray[i].name);
		}
		
		for(Dog d: dogArray) { //for each loop 
			System.out.println(d.name);
		}
		
		
	}

}
