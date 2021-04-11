package org.example.spring.infrastructures.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientDetails extends IBaseVo {
    private Patient patient;
}