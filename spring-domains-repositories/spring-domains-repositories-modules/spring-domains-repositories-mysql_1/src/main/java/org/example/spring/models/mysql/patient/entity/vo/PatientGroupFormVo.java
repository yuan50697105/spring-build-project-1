package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.*;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupFormVo extends ICommonsEntity {
    private TPatientGroupVo group;
    private TPatientTeamMealVo meal;
    private List<TPatientTeamMealFeeItemVo> feeItems;
    private List<TPatientTeamMealCheckItemVo> checkItems;
    private List<TPatientVo> patients;

}