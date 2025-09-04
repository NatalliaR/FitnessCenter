package com.solvd.fitness.person;

import com.solvd.fitness.enums.ActivityLevel;
import com.solvd.fitness.exeptions.IncorrectHeightException;
import com.solvd.fitness.exeptions.IncorrectWeightException;

import java.util.Objects;

public abstract class Person implements IHasHeight, IHasWeight {

    private final int heightCm;
    private final int weightKg;
    private final ActivityLevel activityLevel;

    public Person(int heightCm, int weightKg, ActivityLevel activityLevel) throws Exception {
        if (heightCm <= 0) {
            throw new IncorrectHeightException("Height must be positive");
        }

        if (weightKg <= 0) {
            throw new IncorrectWeightException("Weight must be positive");
        }

        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.activityLevel = activityLevel;
    }

    public abstract int getIdealWeightKg();

    @Override
    public int getHeightCm() {
        return heightCm;
    }

    @Override
    public int getWeightKg() {
        return weightKg;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public float getWeightCoefficient() {
        int weightCoefficient = (getWeightKg() - getIdealWeightKg()) / 5 + 1;

        if (weightCoefficient < 0) {
            weightCoefficient = 1 - weightCoefficient;
        }

        return weightCoefficient;
    }

    @Override
    public String toString() {
        return "com.solvd.fitness.person.Person{" +
                "heightCm=" + heightCm +
                ", weightKg=" + weightKg +
                ", activityLevel='" + activityLevel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return heightCm == person.heightCm && weightKg == person.weightKg && Objects.equals(activityLevel, person.activityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heightCm, weightKg, activityLevel);
    }
}
