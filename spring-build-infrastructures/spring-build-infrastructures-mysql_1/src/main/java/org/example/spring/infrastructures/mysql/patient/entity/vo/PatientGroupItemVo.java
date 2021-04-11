package org.example.spring.infrastructures.mysql.patient.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupItem;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupItemVo extends TPatientGroupItem {
}