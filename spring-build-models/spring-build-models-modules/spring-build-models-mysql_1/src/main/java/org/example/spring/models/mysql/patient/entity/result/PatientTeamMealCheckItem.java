package org.example.spring.models.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealCheckItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealCheckItem extends TPatientTeamMealCheckItem {
}