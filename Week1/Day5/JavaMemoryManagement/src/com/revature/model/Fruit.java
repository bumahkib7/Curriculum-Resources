package com.revature.model;

public class Fruit {
	
	private String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
	

}
