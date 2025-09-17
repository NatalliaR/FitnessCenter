package com.solvd.fitness.center;

import com.solvd.fitness.exeptions.ClientDataException;
import com.solvd.fitness.person.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public abstract class PlanProvider<TItem, TPlan> {

    private List<TItem> planItems;

    public PlanProvider(List<TItem> planItems) {
        this.planItems = planItems;
    }

    public abstract TPlan createPlan(Person client, Predicate<TItem> filter) throws ClientDataException;

    public Stream<TItem> getPlanItems() {
        return planItems.stream();
    }
}
