package org.example.spring.models.mysql.patient.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.patient.table.po.TPatient;

@EqualsAndHashCode(callSuper = true)
@Data
public class Patient extends TPatient {
}