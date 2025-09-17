package com.solvd.fitness.center;

import com.solvd.fitness.exeptions.ClientDataException;
import com.solvd.fitness.meal.Meal;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.NutritionPlan;

import java.util.List;
import java.util.function.Predicate;

public class Nutrition extends PlanProvider<Meal, NutritionPlan> {

    public Nutrition(List<Meal> meals) {
        super(meals);
    }

    @Override
    public NutritionPlan createPlan(Person client, Predicate<Meal> filter) throws ClientDataException {
        return switch (client.getActivityLevel()) {
            case NOT_ACTIVE -> createPlan(2 * client.getWeightCoefficient(), filter);
            case SOMEHOW_ACTIVE -> createPlan(client.getWeightCoefficient(), filter);
            default -> createPlan(0.8f * client.getWeightCoefficient(), filter);
        };
    }

    private NutritionPlan createPlan(float coefficient, Predicate<Meal> filter) {
        List<String> instructions = getPlanItems().filter(filter).map(meal -> {
            return meal.toString() + ": " + (int) (coefficient * meal.getIdealWeightGrams()) + "g";
        }).toList();

        return new NutritionPlan(instructions);
    }
}
