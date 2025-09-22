package com.solvd.fitness.exercise;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ExerciseType {

    boolean isActive();
}
