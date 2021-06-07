package org.example.spring.repositories.commons.entity.patient.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.MealType;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMeal;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealVo extends PatientTeamMeal {
    @Override
    public String getMealType() {
        return MealType.getValue(super.getMealType());
    }

    @Override
    public void setMealType(String mealType) {
        super.setMealType(MealType.getValue(mealType));
    }
}