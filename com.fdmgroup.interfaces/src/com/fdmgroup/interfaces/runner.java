package com.fdmgroup.interfaces;

public class runner {
    public static void main(String[] args) {
        Toy toy = new Toy();
        toy.setName("Lego");
        toy.setPrice(10.00);

        Laptop laptop = new Laptop();
        laptop.setName("Dell");
        laptop.setPrice(500.00);

        Snack snack3 = new Snack();
        snack3.setCalories(400);
        snack3.setName("Mars Bar");
        snack3.setPrice(0.65);

        Snack snack4 = new Snack();
        snack4.setCalories(600);
        snack4.setName("Snickers");
        snack4.setPrice(0.75);

        ReadyMeal readyMeal = new ReadyMeal();
        readyMeal.setName("Chicken Tikka Masala");
        readyMeal.setPrice(3.50);
        readyMeal.setCalories(800);

        ReadyMeal readyMeal2 = new ReadyMeal();
        readyMeal2.setName("Chicken Korma");
        readyMeal2.setPrice(3.50);
        readyMeal2.setCalories(300);

        Basket basket = new Basket();
        CalorieCounter calorieCounter = new CalorieCounter();
        basket.addItem(readyMeal2);
        basket.addItem(readyMeal);
        basket.addItem(snack4);
        basket.addItem(snack3);
        basket.addItem(laptop);
        basket.addItem(toy);

        // for (BasketItem item : basket.getItems()) {
        //     System.out.println(item.getName() + " " + item.getPrice());
        // }

        basket.removeItem(toy);

        calorieCounter.addLowCalorieFood(readyMeal);
        calorieCounter.addLowCalorieFood(readyMeal2);
        calorieCounter.addLowCalorieFood(snack3);

        // System.out.println("After removing toy");
        // for (BasketItem item : basket.getItems()) {
        //     System.out.println(item.getName() + " " + item.getPrice());
        // }

        // calorieCounter.addLowCalorieFood(toy);
        for (FoodItem item : calorieCounter.getAllLowCalorieFoods()) {
            if (item instanceof BasketItem) {
                System.out.println(((BasketItem) item).getName() + " " + item.getCalories());
            }


        }





        
    }
    
}
