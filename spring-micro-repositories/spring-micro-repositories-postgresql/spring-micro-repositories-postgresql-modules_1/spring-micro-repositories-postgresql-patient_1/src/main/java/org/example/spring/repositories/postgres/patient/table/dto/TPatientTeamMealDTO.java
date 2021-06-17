package org.example.spring.repositories.postgres.patient.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.MealType;
import org.example.spring.repositories.postgres.patient.table.po.TPatientTeamMeal;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamMealDTO extends TPatientTeamMeal implements Serializable {
    @Override
    public String getMealType() {
        return MealType.getName(super.getMealType());
    }
}