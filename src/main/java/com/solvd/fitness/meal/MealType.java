package com.solvd.fitness.meal;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MealType {

    boolean isVegan();
}
