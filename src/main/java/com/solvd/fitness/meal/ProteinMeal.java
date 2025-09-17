package com.solvd.fitness.meal;

public class ProteinMeal extends Meal {

    public ProteinMeal(String name, int idealWeightGrams) {
        super(name, idealWeightGrams, false);
    }

    @Override
    public String toString() {
        return "Protein: " + super.toString();
    }
}
