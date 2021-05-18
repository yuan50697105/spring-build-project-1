package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.TPatientTeamMealCheckItemVo;
import org.example.spring.daos.mysql.patient.table.vo.TPatientTeamMealFeeItemVo;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFeeItemFormVo extends IModelVo {
    private TPatientTeamMealFeeItemVo feeItem;
    private List<TPatientTeamMealCheckItemVo> checkItems;

}