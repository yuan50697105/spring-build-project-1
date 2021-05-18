package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupFormVo extends IModelVo {
    private TPatientGroupVo group;
    private TPatientTeamMealVo meal;
    private List<TPatientTeamMealFeeItemVo> feeItems;
    private List<TPatientTeamMealCheckItemVo> checkItems;
    private List<TPatientVo> patients;

}