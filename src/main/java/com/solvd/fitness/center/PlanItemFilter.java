package com.solvd.fitness.center;

@FunctionalInterface
public interface PlanItemFilter<TItem> {

    boolean shouldInclude(TItem item);
}
