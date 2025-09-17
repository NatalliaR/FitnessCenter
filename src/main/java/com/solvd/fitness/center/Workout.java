package com.solvd.fitness.center;

import com.solvd.fitness.exeptions.ClientDataException;
import com.solvd.fitness.exercise.Exercise;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.WorkoutPlan;

import java.util.List;
import java.util.function.Predicate;

public class Workout extends PlanProvider<Exercise, WorkoutPlan> {

    public Workout(List<Exercise> exerciseList) {
        super(exerciseList);
    }

    @Override
    public WorkoutPlan createPlan(Person client, Predicate<Exercise> filter) throws ClientDataException {
        if (client.getWeightCoefficient() <= 0) {
            throw new ClientDataException("Client weight coefficient has to be positive");
        }
        return switch (client.getActivityLevel()) {
            case NOT_ACTIVE -> buildPlan(0.5f * client.getWeightCoefficient(), filter);
            case SOMEHOW_ACTIVE -> buildPlan(client.getWeightCoefficient(), filter);
            default -> buildPlan(1.2f * client.getWeightCoefficient(), filter);
        };
    }

    private WorkoutPlan buildPlan(float coefficient, Predicate<Exercise> filter) {
        List<String> instructions = getPlanItems().filter(filter).map(exercise -> {
            return exercise.toString() + ": " + (int) (coefficient * exercise.getIdealTime()) + "min";
        }).toList();
        return new WorkoutPlan(instructions);
    }
}
