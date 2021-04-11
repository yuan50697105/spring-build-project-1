package org.example.spring.infrastructures.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientFormVo extends IBaseVo {
    private PatientVo patient;
}