package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Account;
import com.revature.util.ConnectionFactory;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean insertAccount(Account a) {
		
		//I I want to execute a query to my db, what interfaces do I need?
		// Connection
		// Statement
		// PreparedStatement 
		
		String sql = "INSERT INTO bank_accounts (name,password,balance) VALUES (?,?,?);";
		
		try(Connection connection = ConnectionFactory.getConnection();){
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, a.getName());
			ps.setString(2, a.getPassword());
			ps.setDouble(3, a.getBalance());
			ps.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public List<Account> getAllAcounts() {
		String sql = "SELECT * FROM bank_accounts";
		List<Account> accountList = new ArrayList<>();
		
		try(Connection connection = ConnectionFactory.getConnection();){
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				accountList.add(new Account(
						rs.getString("name"),
						rs.getString("password"),
						rs.getDouble("balance")
						));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return accountList;
	}

	@Override
	public Account getAccountByName(String name) {
		String sql = "SELECT * FROM bank_accounts WHERE name = ?";
		Account dbAccount = new Account();
		
		try(Connection connection = ConnectionFactory.getConnection();){
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				dbAccount = new Account(
						rs.getString("name"),
						rs.getString("password"),
						rs.getDouble("balance")
						);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return dbAccount;
	}

	@Override
	public Account getAccountById(int id) {
		String sql = "SELECT * FROM bank_accounts WHERE id = ?";
		Account dbAccount = new Account();
		
		try(Connection connection = ConnectionFactory.getConnection();){
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				dbAccount = new Account(
						rs.getString("name"),
						rs.getString("password"),
						rs.getDouble("balance")
						);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return dbAccount;
	}

	@Override
	public boolean updateAccountBalance(Account a, double newBalance) {

		String sql = 
				"UPDATE bank_accounts SET balance = ? WHERE name = ?;";
		
		try(Connection connection = ConnectionFactory.getConnection();){
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDouble(1, newBalance);
			ps.setString(2, a.getName());
			ps.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
