package com.solvd.fitness.plan;

import java.util.List;
import java.util.stream.Stream;

public record NutritionPlan(List<String> instructions) implements IPlan {

    @Override
    public Stream<String> getInstructions() {
        return instructions.stream();
    }

    @Override
    public String getName() {
        return "Nutrition Plan";
    }
}
