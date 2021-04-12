package org.example.spring.infrastructures.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.entity.enumerate.MealType;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientMeal;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientMealVo extends TPatientMeal {
    @Override
    public void setMealType(String mealType) {
        super.setMealType(Optional.ofNullable(MealType.get(mealType)).map(MealType::getValue).orElse(null));
    }
}