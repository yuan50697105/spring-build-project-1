package org.example.spring.daos.mssql.patient.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mssql.patient.table.po.TPatientTeam;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientTeamVo extends TPatientTeam implements Serializable {

}