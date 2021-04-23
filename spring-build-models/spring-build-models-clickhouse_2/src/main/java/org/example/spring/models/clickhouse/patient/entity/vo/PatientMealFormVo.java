package org.example.spring.models.clickhouse.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.clickhouse.patient.table.vo.PatientMealVo;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientMealFormVo extends IModelVo {
    private PatientMealVo meal;
    private List<PatientFeeItemFormVo> items;

}