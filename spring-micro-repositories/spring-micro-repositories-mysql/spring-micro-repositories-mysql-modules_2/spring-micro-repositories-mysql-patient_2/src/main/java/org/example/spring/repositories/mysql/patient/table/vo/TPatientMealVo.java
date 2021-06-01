package org.example.spring.repositories.mysql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.po.TPatientMeal;
import org.example.spring.daos.mysql.table.enumerate.MealType;
import org.example.spring.repositories.mysql.patient.table.po.TPatientMeal;

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
