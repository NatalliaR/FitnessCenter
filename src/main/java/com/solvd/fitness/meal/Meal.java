package com.solvd.fitness.meal;

import com.solvd.fitness.person.IHasName;

public abstract class Meal implements IHasName {

    private final String name;
    private final int idealWeightGrams;
    private final boolean vegan;

    public Meal(String name, int idealWeightGrams, boolean vegan) {
        this.name = name;
        this.vegan = vegan;
        this.idealWeightGrams = idealWeightGrams;
    }

    public boolean isVegan() {
        return vegan;
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
