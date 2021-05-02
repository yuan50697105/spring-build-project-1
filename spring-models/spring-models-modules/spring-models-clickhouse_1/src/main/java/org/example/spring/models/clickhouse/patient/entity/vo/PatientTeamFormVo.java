package org.example.spring.models.clickhouse.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.clickhouse.patient.table.vo.PatientTeamVo;
import org.example.spring.models.commons.entity.IModelVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamFormVo extends IModelVo {
    private PatientTeamVo team;

}