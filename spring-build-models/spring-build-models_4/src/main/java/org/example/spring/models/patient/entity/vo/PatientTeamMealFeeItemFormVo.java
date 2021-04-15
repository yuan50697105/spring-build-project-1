package org.example.spring.models.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamMealFeeItemFormVo extends IBaseVo {
    private PatientTeamMealFeeItemVo feeItem;
    private List<PatientTeamMealCheckItemVo> checkItems;
}