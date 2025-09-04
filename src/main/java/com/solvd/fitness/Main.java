package com.solvd.fitness;

import com.solvd.fitness.center.FitnessCenter;
import com.solvd.fitness.enums.ActivityLevel;
import com.solvd.fitness.enums.FitnessGoal;
import com.solvd.fitness.person.Female;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.IPlan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        int weightKg = 57;
        int heightCm = 160;
        FitnessGoal goal = FitnessGoal.LOOSE_WEIGHT;

        try {
            Person client = new Female(heightCm, weightKg, ActivityLevel.NOT_ACTIVE);

            FitnessCenter fitnessCenter = new FitnessCenter();

            IPlan workoutPlan = fitnessCenter.getWorkoutPlan(client, goal);
            IPlan nutritionPlan = fitnessCenter.getNutritionPlan(client, goal);

            LOGGER.info("Departments: " + fitnessCenter.getDepartmentNames());

            LOGGER.info(workoutPlan.getDescription());
            LOGGER.info(nutritionPlan.getDescription());

        } catch (Exception e) {
            LOGGER.error("Exception while retrieving plans", e);
        }

    }
}