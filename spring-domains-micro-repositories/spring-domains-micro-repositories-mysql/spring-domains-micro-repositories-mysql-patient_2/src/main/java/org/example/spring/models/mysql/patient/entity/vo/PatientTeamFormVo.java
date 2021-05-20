package org.example.spring.models.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.vo.TPatientTeamVo;
import org.example.spring.models.commons.entity.IModelVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamFormVo extends IModelVo {
    private TPatientTeamVo team;

}