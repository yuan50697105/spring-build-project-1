package org.example.spring.models.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFormVo extends IModelVo {
    private PatientVo patient;
    private PatientMealFormVo meal;
    private List<PatientFeeItemFormVo> feeItems;

}