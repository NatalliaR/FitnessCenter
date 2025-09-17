package com.solvd.fitness.center;

import com.solvd.fitness.exeptions.ClientDataException;
import com.solvd.fitness.meal.Meal;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.NutritionPlan;

import java.util.List;

public class Nutrition extends PlanProvider<Meal, NutritionPlan> {

    public Nutrition(List<Meal> meals) {
        super(meals);
    }

    @Override
    public NutritionPlan createPlan(Person client) throws ClientDataException {
        return switch (client.getActivityLevel()) {
            case NOT_ACTIVE -> createPlan(2 * client.getWeightCoefficient());
            case SOMEHOW_ACTIVE -> createPlan(client.getWeightCoefficient());
            default -> createPlan(0.8f * client.getWeightCoefficient());
        };
    }

    private NutritionPlan createPlan(float coefficient) {
        List<String> instructions = getPlanItems().map(meal -> {
            return meal.toString() + ": " + (int) (coefficient * meal.getIdealWeightGrams()) + "g";
        }).toList();

        return new NutritionPlan(instructions);
    }
}
