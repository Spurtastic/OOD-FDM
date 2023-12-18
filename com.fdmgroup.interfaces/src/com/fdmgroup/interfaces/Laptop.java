package com.fdmgroup.interfaces;

public class Laptop implements BasketItem {
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
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(double price) {
        this.price=price;
		
	}
	
	

    
}
