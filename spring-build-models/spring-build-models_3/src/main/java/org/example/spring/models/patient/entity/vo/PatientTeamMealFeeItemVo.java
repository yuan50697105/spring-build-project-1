package org.example.spring.models.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.es.patient.entity.po.TPatientTeamMealFeeItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFeeItemVo extends TPatientTeamMealFeeItem {
}