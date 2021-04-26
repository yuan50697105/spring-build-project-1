package org.example.spring.models.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeam;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeam extends TPatientTeam {
}