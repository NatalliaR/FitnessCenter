package com.solvd.fitness.exercise;

public class AquaticExercise extends Exercise {

    public AquaticExercise(String name, int idealTime) {
        super(name, idealTime);
    }

    @Override
    public String toString() {
        return "Aquatics: " + super.toString();
    }
}
