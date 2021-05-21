package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.TPatientTeamMealVo;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFormVo extends ICommonsEntity {
    private TPatientTeamMealVo meal;
    private List<PatientTeamMealFeeItemFormVo> feeItems;

}