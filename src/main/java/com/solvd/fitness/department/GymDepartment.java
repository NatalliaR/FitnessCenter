package com.solvd.fitness.department;

import com.solvd.fitness.center.Workout;
import com.solvd.fitness.enums.FitnessGoal;
import com.solvd.fitness.exercise.AquaticExercise;
import com.solvd.fitness.exercise.AthleticExercise;
import com.solvd.fitness.exercise.WeightLiftingExercise;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.IPlan;

import java.util.List;

public class GymDepartment extends ProfileDepartment<Workout> {

    public GymDepartment() {
        addProfile(FitnessGoal.LOOSE_WEIGHT, new Workout(
                List.of(
                        new AthleticExercise("Running", 10),
                        new AquaticExercise("Swimming", 20)
                )
        ));

        addProfile(FitnessGoal.GAIN_MUSCLES, new Workout(
                List.of(
                        new AquaticExercise("AquaAerobics", 20),
                        new WeightLiftingExercise("Pulls Up", 20),
                        new AthleticExercise("Running", 30)
                )
        ));

        addProfile(FitnessGoal.IMPROVE_ENDURANCE, new Workout(
                List.of(
                        new AthleticExercise("Running", 15),
                        new AquaticExercise("Swimming", 30),
                        new AthleticExercise("Jumping", 15)
                )
        ));
    }

    @Override
    public IPlan getPlan(Person client, FitnessGoal goal) throws Exception {
        return getProfile(goal).createPlan(client, exercise -> exercise.isActive());
    }
}
