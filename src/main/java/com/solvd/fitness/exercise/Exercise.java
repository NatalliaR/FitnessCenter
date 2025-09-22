package com.solvd.fitness.exercise;

import com.solvd.fitness.person.IHasName;

public abstract class Exercise implements IHasName {

    private final String name;
    private final int idealTime;

    public Exercise(String name, int idealTime) {
        this.name = name;
        this.idealTime = idealTime;
    }

    public String getName() {
        return name;
    }

    public int getIdealTime() {
        return idealTime;
    }

    @Override
    public String toString() {
        return "name - " + name;
    }
}
