package com.fdmgroup.interfaces;

public class ReadyMeal implements BasketItem, FoodItem {
    private String name;
    private double price;
    private int calories;

	@Override
	public int getCalories() {
		return calories;
	}

	@Override
	public void setCalories(int calories) {
        this.calories=calories;
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
        this.name=name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
        this.price=price;
	}
	
	
    
}
