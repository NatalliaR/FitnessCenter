package com.solvd.fitness.person;

import com.solvd.fitness.enums.ActivityLevel;

public class Male extends Person {

    public Male(int heightCm, int weightKg, ActivityLevel activityLevel) throws Exception {
        super(heightCm, weightKg, activityLevel);
    }

    @Override
    public int getIdealWeightKg() {
        return (getHeightCm() - 100) + 10;
    }
}
