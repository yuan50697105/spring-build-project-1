package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.PatientTeamMealCheckItemVo;
import org.example.spring.daos.mysql.patient.table.vo.PatientTeamMealFeeItemVo;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFeeItemFormVo extends IModelVo {
    private PatientTeamMealFeeItemVo feeItem;
    private List<PatientTeamMealCheckItemVo> checkItems;

}