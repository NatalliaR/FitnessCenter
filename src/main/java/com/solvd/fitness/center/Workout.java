package com.solvd.fitness.center;

import com.solvd.fitness.exeptions.ClientDataException;
import com.solvd.fitness.exercise.Exercise;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.WorkoutPlan;

import java.util.List;

public class Workout extends PlanProvider<Exercise, WorkoutPlan> {

    public Workout(List<Exercise> exerciseList) {
        super(exerciseList);
    }

    @Override
    public WorkoutPlan createPlan(Person client) throws ClientDataException {
        if (client.getWeightCoefficient() <= 0) {
            throw new ClientDataException("Client weight coefficient has to be positive");
        }
        return switch (client.getActivityLevel()) {
            case NOT_ACTIVE -> buildPlan(0.5f * client.getWeightCoefficient());
            case SOMEHOW_ACTIVE -> buildPlan(client.getWeightCoefficient());
            default -> buildPlan(1.2f * client.getWeightCoefficient());
        };
    }

    private WorkoutPlan buildPlan(float coefficient) {
        List<String> instructions = getPlanItems().map(exercise -> {
            return exercise.toString() + ": " + (int) (coefficient * exercise.getIdealTime()) + "min";
        }).toList();
        return new WorkoutPlan(instructions);
    }
}
