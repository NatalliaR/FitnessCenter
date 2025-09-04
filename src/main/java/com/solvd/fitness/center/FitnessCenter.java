package com.solvd.fitness.center;

import com.solvd.fitness.department.GymDepartment;
import com.solvd.fitness.department.IDepartment;
import com.solvd.fitness.department.NutritionDepartment;
import com.solvd.fitness.enums.BusinessUnit;
import com.solvd.fitness.enums.FitnessGoal;
import com.solvd.fitness.person.Person;
import com.solvd.fitness.plan.IPlan;

import java.util.Set;

public class FitnessCenter extends Business<IDepartment> {

    public FitnessCenter() {
        addUnit(BusinessUnit.GYM, new GymDepartment());
        addUnit(BusinessUnit.NUTRITION, new NutritionDepartment());
    }

    public IPlan getWorkoutPlan(Person client, FitnessGoal goal) throws Exception {
        return getUnit(BusinessUnit.GYM).getPlan(client, goal);
    }

    public IPlan getNutritionPlan(Person client, FitnessGoal goal) throws Exception {
        return getUnit(BusinessUnit.NUTRITION).getPlan(client, goal);
    }

    public Set<BusinessUnit> getDepartmentNames() {
        return getAllUnitsName();
    }
}
