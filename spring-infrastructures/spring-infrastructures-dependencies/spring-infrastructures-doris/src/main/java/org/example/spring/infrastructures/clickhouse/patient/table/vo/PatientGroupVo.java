package org.example.spring.infrastructures.clickhouse.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.clickhouse.patient.table.po.TPatientGroup;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupVo extends TPatientGroup {
}