package com.solvd.fitness.plan;

import java.util.stream.Stream;

@FunctionalInterface
public interface PlanDescriptionBuilder {

    String getDescription(Stream<String> instructions);
}
