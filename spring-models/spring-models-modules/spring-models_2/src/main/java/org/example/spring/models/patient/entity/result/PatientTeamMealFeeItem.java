package org.example.spring.models.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealFeeItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFeeItem extends TPatientTeamMealFeeItem {
}