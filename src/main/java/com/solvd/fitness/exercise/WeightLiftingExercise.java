package com.solvd.fitness.exercise;

@ExerciseType(isActive = false)
public class WeightLiftingExercise extends Exercise {

    public WeightLiftingExercise(String name, int idealTime) {
        super(name, idealTime);
    }

    @Override
    public String toString() {
        return "Weight Lifting: " + super.toString();
    }
}
