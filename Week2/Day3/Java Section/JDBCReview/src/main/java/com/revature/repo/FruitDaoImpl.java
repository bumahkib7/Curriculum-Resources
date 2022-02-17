package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Fruit;
import com.revature.util.ConnectionFactory;

public class FruitDaoImpl implements FruitDao{

	@Override
	public boolean insertFruit(Fruit f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fruit> getAllFruits() {
		String sql = "SELECT * FROM better_fruit_table";
		Connection conn = ConnectionFactory.getConnection();
		List<Fruit> fruitList = new ArrayList<>();
		
		//We don't use Statement, we use PreparedStatement
		//We try to close the connection after we are done with it
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				fruitList.add(new Fruit(rs.getString("fruit_name")));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return fruitList;
	}

	@Override
	public List<Fruit> getFruitByName(String name) {
		String sql = "SELECT * FROM better_fruit_table WHERE fruit_name = ?";
		List<Fruit> fruitList = new ArrayList<>();
		
		
		//try with resources! 
		//Where the resource is closed after we finish with the try block!
		try (Connection conn = ConnectionFactory.getConnection()){ //conn will be closed after we are done!
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			
			/*
			 * Prepared Statements are better because: 
			 * 	We don't have SQL injection happening e.g. 
			 * 		Select * from table where name = ; Drop Table;
			 * 
			 * Prepared Statements ensure the expression is treated as a string!
			 * 
			 * It's a lot cleaner to work with, because you don't have to deal with 
			 * 	''. 
			 * 
			 */
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				fruitList.add(new Fruit(rs.getString("fruit_name")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fruitList;
	}

	@Override
	public boolean updateFruit(Fruit f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFruit(Fruit f) {
		// TODO Auto-generated method stub
		return false;
	}

}
