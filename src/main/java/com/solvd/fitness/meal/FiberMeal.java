package com.solvd.fitness.meal;

public class FiberMeal extends Meal {

    public FiberMeal(String name, int idealWeightGrams) {
        super(name, idealWeightGrams, true);
    }

    @Override
    public String toString() {
        return "Fiber: " + super.toString();
    }
}
