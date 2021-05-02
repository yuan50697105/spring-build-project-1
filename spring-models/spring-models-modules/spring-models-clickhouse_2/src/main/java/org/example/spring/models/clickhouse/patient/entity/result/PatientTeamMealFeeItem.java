package org.example.spring.models.clickhouse.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.clickhouse.patient.table.po.TPatientTeamMealFeeItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFeeItem extends TPatientTeamMealFeeItem {
}