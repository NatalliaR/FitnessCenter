package com.solvd.fitness.department;

import com.solvd.fitness.enums.FitnessGoal;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.IPlan;

public interface IDepartment {

    IPlan getPlan(Person client, FitnessGoal goal) throws Exception;

}
