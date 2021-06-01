package org.example.spring.daos.postgres.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgres.patient.table.po.TPatientTeamMeal;
import org.example.spring.daos.mysql.table.enumerate.MealType;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamMealVo extends TPatientTeamMeal {
    @Override
    public String getMealType() {
        return MealType.getValue(super.getMealType());
    }

    @Override
    public void setMealType(String mealType) {
        super.setMealType(MealType.getValue(mealType));
    }
}