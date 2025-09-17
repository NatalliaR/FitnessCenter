package com.solvd.fitness.exercise;

import com.solvd.fitness.person.IHasName;

public abstract class Exercise implements IHasName {

    private final String name;
    private final int idealTime;
    private final boolean active;

    public Exercise(String name, int idealTime, boolean active) {
        this.name = name;
        this.active = active;
        this.idealTime = idealTime;
    }

    public boolean isActive() {
        return active;
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
