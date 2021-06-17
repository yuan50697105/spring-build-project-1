package org.example.spring.repositories.commons.entity.patient.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.entity.patient.po.PatientTeamMealCheckItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealCheckItemDTO extends PatientTeamMealCheckItem {
}