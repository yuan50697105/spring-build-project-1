package org.example.spring.infrastructures.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupDetails extends IBaseVo {
    private PatientGroup group;
    private List<PatientGroupItem> items;
    private List<Patient> patients;
}