package com.fdmgroup.interfaces;

public class Toy implements BasketItem {
    private String name;
    private double price;

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
