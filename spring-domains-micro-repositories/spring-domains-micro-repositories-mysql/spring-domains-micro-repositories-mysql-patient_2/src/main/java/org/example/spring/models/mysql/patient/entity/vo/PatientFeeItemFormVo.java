package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.TPatientCheckItemVo;
import org.example.spring.daos.mysql.patient.table.vo.TPatientFeeItemVo;
import org.example.spring.models.commons.entity.ICommonsEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFeeItemFormVo extends ICommonsEntity {
    private TPatientFeeItemVo feeItem;
    private List<TPatientCheckItemVo> checkItems;

}