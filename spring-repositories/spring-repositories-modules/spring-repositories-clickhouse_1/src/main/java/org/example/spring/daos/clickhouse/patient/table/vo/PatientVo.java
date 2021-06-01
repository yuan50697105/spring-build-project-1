package org.example.spring.repositories.clickhouse.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.clickhouse.patient.table.po.TPatient;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientVo extends TPatient {

}