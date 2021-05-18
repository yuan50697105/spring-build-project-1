package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.TPatientVo;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFormVo extends IModelVo {
    private TPatientVo patient;
    private PatientMealFormVo meal;
    private List<PatientFeeItemFormVo> feeItems;

}