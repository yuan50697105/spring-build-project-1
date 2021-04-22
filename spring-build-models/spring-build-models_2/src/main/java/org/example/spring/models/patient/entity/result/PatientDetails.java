package org.example.spring.models.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

@Data
public class PatientDetails  {
    private Patient patient;

}