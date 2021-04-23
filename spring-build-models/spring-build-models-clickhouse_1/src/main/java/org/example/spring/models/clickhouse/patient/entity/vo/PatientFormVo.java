package org.example.spring.models.clickhouse.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.clickhouse.patient.table.vo.PatientVo;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFormVo extends IModelVo {
    private PatientVo patient;
    private PatientMealFormVo meal;
    private List<PatientFeeItemFormVo> feeItems;

}