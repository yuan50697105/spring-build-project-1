package org.example.spring.repositories.commons.patient.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.commons.patient.po.PatientTeam;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamVo extends PatientTeam implements Serializable {

}