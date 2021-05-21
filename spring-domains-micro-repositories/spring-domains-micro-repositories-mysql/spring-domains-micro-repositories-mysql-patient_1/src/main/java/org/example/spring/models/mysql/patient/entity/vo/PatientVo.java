package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.TPatientVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientVo extends TPatientVo {
}