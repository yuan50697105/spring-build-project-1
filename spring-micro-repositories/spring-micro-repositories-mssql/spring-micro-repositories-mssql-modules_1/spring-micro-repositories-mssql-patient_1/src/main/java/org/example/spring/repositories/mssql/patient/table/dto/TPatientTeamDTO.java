package org.example.spring.repositories.mssql.patient.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mssql.patient.table.po.TPatientTeam;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamDTO extends TPatientTeam implements Serializable {
}