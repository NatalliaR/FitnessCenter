package com.solvd.fitness.plan;

import java.util.List;

public interface IPlan {

    String getName();

    List<String> getInstructions();

    default String getDescription() {
        return getName() + ": " + getInstructions();
    }
}
