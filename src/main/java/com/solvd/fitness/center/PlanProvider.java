package com.solvd.fitness.center;

import com.solvd.fitness.exeptions.ClientDataException;
import com.solvd.fitness.person.Person;

import java.util.List;

public abstract class PlanProvider<TItem, TPlan> {

    private List<TItem> planItems;

    public PlanProvider(List<TItem> planItems) {
        this.planItems = planItems;
    }

    public abstract TPlan createPlan(Person client) throws ClientDataException;

    public List<TItem> getPlanItems() {
        return planItems;
    }
}
