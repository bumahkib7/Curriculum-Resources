package com.revature;

import com.revature.repo.FruitDao;
import com.revature.repo.FruitDaoImpl;

public class MainDriver {

	public static void main(String[] args) {
		
		
		FruitDao fDao = new FruitDaoImpl();
		
		System.out.println(fDao.getAllFruits());
		System.out.println(fDao.getFruitByName("Kiwi"));

	}

}
