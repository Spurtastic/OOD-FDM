package org.example;

import java.util.HashMap;

public class Market {

    private HashMap<Produce, ?> producePrices;

    public Market(HashMap<Produce, ?> producePrices){
        this.producePrices = new HashMap<Produce, Double>();
    }
}
