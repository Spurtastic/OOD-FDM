package com.fdmgroup.interfaces;

public class Snack implements BasketItem, FoodItem{
	
	private int calories;
	private String name;
	private double price;

	

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return this.calories;
	}

	@Override
	public void setCalories(int calories) {
		this.calories=calories;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
		
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		this.price=price;
	}
	
	

}
