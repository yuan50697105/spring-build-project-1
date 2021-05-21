package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.TPatientMealVo;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientMealFormVo extends ICommonsEntity {
    private TPatientMealVo meal;
    private List<PatientFeeItemFormVo> items;

}