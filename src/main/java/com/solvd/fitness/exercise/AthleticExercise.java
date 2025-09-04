package com.solvd.fitness.exercise;

public class AthleticExercise extends Exercise {

    public AthleticExercise(String name, int idealTime) {
        super(name, idealTime);
    }

    @Override
    public String toString() {
        return "Athletics: " + super.toString();
    }
}
