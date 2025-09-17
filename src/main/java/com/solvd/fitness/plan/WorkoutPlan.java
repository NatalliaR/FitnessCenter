package com.solvd.fitness.plan;

import java.util.List;
import java.util.stream.Stream;

public class WorkoutPlan implements IPlan {

    private final List<String> instructions;

    public WorkoutPlan(List<String> instructions) {
        this.instructions = instructions;
    }

    public Stream<String> getInstructions() {
        return instructions.stream();
    }

    @Override
    public String getName() {
        return "Workout Plan";
    }
}
