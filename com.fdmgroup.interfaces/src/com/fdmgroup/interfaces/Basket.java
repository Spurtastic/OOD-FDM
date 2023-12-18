package com.fdmgroup.interfaces;

import java.util.ArrayList;

public class Basket{
    private ArrayList<BasketItem> items = new ArrayList<BasketItem>();
    

    public void addItem(BasketItem item) {
        items.add(item);
    }

    public void removeItem(BasketItem item) {
        items.remove(item);
    }

    public ArrayList<BasketItem> getItems() {
        return items;
    }


    
}
