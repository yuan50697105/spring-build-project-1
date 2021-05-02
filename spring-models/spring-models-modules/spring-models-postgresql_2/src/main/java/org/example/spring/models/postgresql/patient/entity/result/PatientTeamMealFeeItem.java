package org.example.spring.models.postgresql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgresql.patient.table.po.TPatientTeamMealFeeItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFeeItem extends TPatientTeamMealFeeItem {
}