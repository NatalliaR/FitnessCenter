package com.solvd.fitness.center;

import com.solvd.fitness.enums.BusinessUnit;
import com.solvd.fitness.exeptions.BusinessException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Business<TUnit> {

    private final Map<BusinessUnit, TUnit> businessUnits = new HashMap<>();

    public Business() {
    }

    public void addUnit(BusinessUnit unitName, TUnit unit) {
        businessUnits.put(unitName, unit);
    }

    public Set<BusinessUnit> getAllUnitsName() {
        return businessUnits.keySet();
    }

    public TUnit getUnit(BusinessUnit unitName) throws BusinessException {
        if (!businessUnits.containsKey(unitName)) {
            throw new BusinessException("Can not find a unit with name " + unitName);
        }

        return businessUnits.get(unitName);
    }
}
