package org.example.spring.repositories.commons.entity.patient.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.patient.po.PatientMeal;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientMealDTO extends PatientMeal {
}