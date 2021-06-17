package org.example.spring.repositories.oracle.patient.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.enumerate.MealType;
import org.example.spring.repositories.oracle.patient.table.po.TPatientMeal;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientMealDTO extends TPatientMeal implements Serializable {
    @Override
    public String getMealType() {
        return MealType.getName(super.getMealType());
    }
}