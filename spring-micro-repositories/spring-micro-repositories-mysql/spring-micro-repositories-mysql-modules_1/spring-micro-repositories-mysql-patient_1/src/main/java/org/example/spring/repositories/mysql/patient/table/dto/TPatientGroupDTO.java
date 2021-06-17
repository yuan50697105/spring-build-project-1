package org.example.spring.repositories.mysql.patient.table.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.mysql.patient.table.po.TPatientGroup;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPatientGroupDTO extends TPatientGroup implements Serializable {
}