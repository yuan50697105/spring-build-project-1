package org.example.spring.infrastructures.postgresql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientTeamMealCheckItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealCheckItemVo extends TPatientTeamMealCheckItem {
}