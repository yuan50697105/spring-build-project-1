package org.example.spring.models.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.PatientCheckItemVo;
import org.example.spring.daos.mysql.patient.table.vo.PatientFeeItemVo;
import org.example.spring.models.commons.entity.IModelVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFeeItemFormVo extends IModelVo {
    private PatientFeeItemVo feeItem;
    private List<PatientCheckItemVo> checkItems;

}