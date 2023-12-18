package com.fdmgroup.interfaces;

import java.util.ArrayList;

public class CalorieCounter {
    private ArrayList<FoodItem> lowCalorieFoods = new ArrayList<FoodItem>();

    public void addLowCalorieFood(FoodItem foodItem) {

        //  if the food is less tha 500 calories add to the list
        if (foodItem.getCalories() < 500){
            lowCalorieFoods.add(foodItem);
        }

    }

    public ArrayList<FoodItem> getAllLowCalorieFoods() {
        return lowCalorieFoods;
    }
}
