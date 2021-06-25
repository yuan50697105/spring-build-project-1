package org.example.spring.repositories.patient.postgres.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeam;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamDTO extends TPatientTeam implements Serializable {
}