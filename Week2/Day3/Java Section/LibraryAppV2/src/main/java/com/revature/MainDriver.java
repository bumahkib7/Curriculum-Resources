package com.revature;

import com.revature.presentation.Menu;
import com.revature.presentation.MenuImpl;
import com.revature.repository.UserDao;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu m = new MenuImpl();
		m.startMenu();
		
//		UserDao uDao = new UserDao();
//		System.out.println(uDao.selectAllObjects());

	}

}
