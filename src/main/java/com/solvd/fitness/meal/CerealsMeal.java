package com.solvd.fitness.meal;

public class CerealsMeal extends Meal {

    public CerealsMeal(String name, int idealWeightGrams) {
        super(name, idealWeightGrams, true);
    }

    @Override
    public String toString() {
        return "Cereals: " + super.toString();
    }
}
