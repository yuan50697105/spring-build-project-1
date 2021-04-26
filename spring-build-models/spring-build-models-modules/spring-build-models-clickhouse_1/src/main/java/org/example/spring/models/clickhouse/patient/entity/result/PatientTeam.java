package org.example.spring.models.clickhouse.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.clickhouse.patient.table.po.TPatientTeam;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeam extends TPatientTeam {
}