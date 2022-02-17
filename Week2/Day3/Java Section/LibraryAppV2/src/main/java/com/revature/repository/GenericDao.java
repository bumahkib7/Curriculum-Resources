package com.revature.repository;

import java.util.List;

public interface GenericDao<T> {
	
	
	//CRUD
	
	//Create
	boolean insertObject(T t);
	
	//Read 
	List<T> selectAllObjects();
	T selectObjectbyId(int id);
	
	//Update
	boolean updateObject(T t);
	
	//Delete
	boolean deleteObject(T t);

}
