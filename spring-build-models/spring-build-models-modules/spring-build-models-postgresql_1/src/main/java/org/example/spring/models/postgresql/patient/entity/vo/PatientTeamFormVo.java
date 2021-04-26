package org.example.spring.models.postgresql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.postgresql.patient.table.vo.PatientTeamVo;
import org.example.spring.models.commons.entity.IModelVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamFormVo extends IModelVo {
    private PatientTeamVo team;

}