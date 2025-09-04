package com.solvd.fitness.plan;

import java.util.List;

public class WorkoutPlan implements IPlan {

    private final List<String> instructions;

    public WorkoutPlan(List<String> instructions) {
        this.instructions = instructions;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    @Override
    public String getName() {
        return "Workout Plan";
    }
}
