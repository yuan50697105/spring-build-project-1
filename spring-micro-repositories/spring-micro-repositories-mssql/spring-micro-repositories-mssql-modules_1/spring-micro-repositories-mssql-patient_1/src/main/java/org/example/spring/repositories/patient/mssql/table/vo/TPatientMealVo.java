package org.example.spring.repositories.patient.mssql.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.MealType;
import org.example.spring.repositories.patient.mssql.table.po.TPatientMeal;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientMealVo extends TPatientMeal {
    @Override
    public String getMealType() {
        return MealType.getValue(super.getMealType());
    }

    @Override
    public void setMealType(String mealType) {
        super.setMealType(MealType.getValue(mealType));
    }
}
