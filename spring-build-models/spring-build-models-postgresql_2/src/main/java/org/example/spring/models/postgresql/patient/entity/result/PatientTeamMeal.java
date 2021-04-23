package org.example.spring.models.postgresql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientTeamMeal;
import org.example.spring.models.commons.enumerate.MealType;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMeal extends TPatientTeamMeal {
    @Override
    public String getMealType() {
        return Optional.ofNullable(MealType.get(super.getMealType())).map(MealType::getName).orElse(null);
    }
}