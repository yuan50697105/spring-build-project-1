package org.example.spring.infrastructures.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupDetails extends IBaseVo {
    private PatientTeam group;
    private List<PatientGroup> items;
}