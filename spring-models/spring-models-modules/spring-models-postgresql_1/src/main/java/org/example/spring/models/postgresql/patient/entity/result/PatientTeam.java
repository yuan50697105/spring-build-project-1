package org.example.spring.models.postgresql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.postgresql.patient.table.po.TPatientTeam;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeam extends TPatientTeam {
}