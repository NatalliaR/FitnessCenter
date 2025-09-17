package com.solvd.fitness.plan;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface IPlan {

    String getName();

    Stream<String> getInstructions();

    default String getDescription() {
        return getName() + ": " + getInstructions().collect(Collectors.joining(", "));
    }
}
