package com.revature.models;

import java.util.Objects;

public class Fruit {
	
	
	private String name;
	private String description;
	private double calories;
	
	private Fruit(String name, String description, double calories) {
		super();
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	
	private Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", description=" + description + ", calories=" + calories + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(calories, description, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Double.doubleToLongBits(calories) == Double.doubleToLongBits(other.calories)
				&& Objects.equals(description, other.description) && Objects.equals(name, other.name);
	}
	
	
	
	

}
