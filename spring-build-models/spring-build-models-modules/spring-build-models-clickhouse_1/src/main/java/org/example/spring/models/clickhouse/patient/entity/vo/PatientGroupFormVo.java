package org.example.spring.models.clickhouse.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.clickhouse.patient.table.vo.*;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupFormVo extends IModelVo {
    private PatientGroupVo group;
    private PatientTeamMealVo meal;
    private List<PatientTeamMealFeeItemVo> feeItems;
    private List<PatientTeamMealCheckItemVo> checkItems;
    private List<PatientVo> patients;

}