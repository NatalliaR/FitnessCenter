package com.solvd.fitness.department;

import com.solvd.fitness.enums.FitnessGoal;

import java.util.HashMap;
import java.util.Map;

public abstract class ProfileDepartment<TProfile> implements IDepartment {

    private Map<FitnessGoal, TProfile> goalToProfile = new HashMap<>();

    public void addProfile(FitnessGoal goal, TProfile profile) {
        goalToProfile.put(goal, profile);
    }

    public TProfile getProfile(FitnessGoal goal) {
        return goalToProfile.get(goal);
    }
}
