package com.solvd.fitness.meal;

import com.solvd.fitness.person.IHasName;

public abstract class Meal implements IHasName {

    private final String name;
    private final int idealWeightGrams;

    public Meal(String name, int idealWeightGrams) {
        this.name = name;
        this.idealWeightGrams = idealWeightGrams;
    }

    public String getName() {
        return name;
    }

    public int getIdealWeightGrams() {
        return idealWeightGrams;
    }

    @Override
    public String toString() {
        return "name - " + name;
    }
}
