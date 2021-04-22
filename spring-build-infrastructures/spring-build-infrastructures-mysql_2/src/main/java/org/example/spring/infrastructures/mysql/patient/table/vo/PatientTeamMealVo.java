package org.example.spring.infrastructures.mysql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.enumerate.MealType;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMeal;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealVo extends TPatientTeamMeal {
    @Override
    public void setMealType(String mealType) {
        super.setMealType(Optional.ofNullable(MealType.get(mealType)).map(MealType::getValue).orElse(null));
    }
}