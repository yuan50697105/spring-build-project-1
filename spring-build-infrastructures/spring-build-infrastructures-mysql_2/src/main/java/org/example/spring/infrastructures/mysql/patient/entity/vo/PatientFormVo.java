package org.example.spring.infrastructures.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFormVo extends IBaseVo {
    private PatientVo patient;
    private PatientMealFormVo meal;
    private List<PatientFeeItemFormVo> feeItems;
}