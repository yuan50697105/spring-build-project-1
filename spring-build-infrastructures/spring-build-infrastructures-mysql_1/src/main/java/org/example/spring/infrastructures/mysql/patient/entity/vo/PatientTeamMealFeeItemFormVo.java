package org.example.spring.infrastructures.mysql.patient.entity.vo;

import lombok.Data;

import java.util.List;

@Data
public class PatientTeamMealFeeItemFormVo {
    private PatientTeamMealFeeItemVo feeItem;
    private List<PatientTeamMealCheckItemVo> checkItems;
}