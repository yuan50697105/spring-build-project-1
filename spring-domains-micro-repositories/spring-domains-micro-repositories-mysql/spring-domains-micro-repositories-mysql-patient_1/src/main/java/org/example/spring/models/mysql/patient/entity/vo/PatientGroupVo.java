package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.po.TPatientGroup;
import org.example.spring.daos.mysql.patient.table.vo.TPatientGroupVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupVo extends TPatientGroupVo {
}