package org.example.spring.models.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealCheckItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealCheckItemVo extends TPatientTeamMealCheckItem {
}