package org.example.spring.models.clickhouse.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.clickhouse.patient.table.vo.PatientTeamMealVo;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFormVo extends IModelVo {
    private PatientTeamMealVo meal;
    private List<PatientTeamMealFeeItemFormVo> feeItems;

}