package org.example.spring.daos.clickhouse.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.clickhouse.patient.table.po.TPatientGroup;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupVo extends TPatientGroup {
}