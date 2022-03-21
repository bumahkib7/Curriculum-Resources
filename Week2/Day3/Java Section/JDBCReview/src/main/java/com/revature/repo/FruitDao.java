package com.revature.repo;

import java.util.List;

import com.revature.models.Fruit;

public interface FruitDao {
	
	/*
	 * DAO: Data Access Object 
	 * It's a way of abstracting database methods via exposing just methods to 
	 * 	the rest of my Java code. 
	 * 
	 * DAO defines CRUD methods that we are going to allow onto our database
	 */
	
	//Create 
	boolean insertFruit(Fruit f);
	
	//Read 
	List<Fruit> getAllFruits();
//	Fruit getFruitById();
	List<Fruit> getFruitByName(String name);
	
	//Update 
	boolean updateFruit(Fruit f);
	
	//Delete 
	boolean deleteFruit(Fruit f);
	
	

}
