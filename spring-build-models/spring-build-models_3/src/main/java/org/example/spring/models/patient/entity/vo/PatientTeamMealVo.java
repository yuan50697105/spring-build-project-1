package org.example.spring.models.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.enumerate.MealType;
import org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMeal;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealVo extends TPatientTeamMeal {
    @Override
    public void setMealType(String mealType) {
        super.setMealType(Optional.ofNullable(MealType.get(mealType)).map(MealType::getValue).orElse(null));
    }
}