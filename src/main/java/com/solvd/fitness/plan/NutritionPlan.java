package com.solvd.fitness.plan;

import java.util.List;

public class NutritionPlan implements IPlan {

    private final List<String> instructions;

    public NutritionPlan(List<String> instructions) {
        this.instructions = instructions;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    @Override
    public String getName() {
        return "Nutrition Plan";
    }
}
