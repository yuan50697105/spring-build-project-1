package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFormVo extends PatientVo {
    private PatientMealFormVo meal;
    private List<PatientFeeItemFormVo> feeItems;

}