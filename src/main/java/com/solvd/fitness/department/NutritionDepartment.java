package com.solvd.fitness.department;

import com.solvd.fitness.center.Nutrition;
import com.solvd.fitness.enums.FitnessGoal;
import com.solvd.fitness.meal.CerealsMeal;
import com.solvd.fitness.meal.FiberMeal;
import com.solvd.fitness.meal.Meal;
import com.solvd.fitness.meal.MealType;
import com.solvd.fitness.meal.ProteinMeal;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.IPlan;

import java.util.List;

public class NutritionDepartment extends ProfileDepartment<Nutrition> {

    public NutritionDepartment() {
        addProfile(FitnessGoal.LOOSE_WEIGHT, new Nutrition(
                List.of(
                        new FiberMeal("Broccoli", 100),
                        new FiberMeal("Carrot", 100),
                        new ProteinMeal("Veal", 200),
                        new ProteinMeal("Chicken Breast", 50)
                )
        ));

        addProfile(FitnessGoal.GAIN_MUSCLES, new Nutrition(
                List.of(
                        new ProteinMeal("Chicken Breast", 100),
                        new FiberMeal("Broccoli", 150),
                        new CerealsMeal("Rise", 200)
                )
        ));

        addProfile(FitnessGoal.IMPROVE_ENDURANCE, new Nutrition(
                List.of(
                        new CerealsMeal("Rice", 100),
                        new ProteinMeal("Chicken Breast", 150)
                )
        ));
    }

    @Override
    public IPlan getPlan(Person client, FitnessGoal goal) throws Exception {
        return getProfile(goal).createPlan(client, meal -> !isVegan(meal));
    }

    private boolean isVegan(Meal meal) {
        MealType mealType = meal.getClass().getDeclaredAnnotation(MealType.class);
        return mealType == null ? false : mealType.isVegan();
    }
}
