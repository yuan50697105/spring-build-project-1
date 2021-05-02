package org.example.spring.models.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.po.TPatientTeam;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeam extends TPatientTeam {
}