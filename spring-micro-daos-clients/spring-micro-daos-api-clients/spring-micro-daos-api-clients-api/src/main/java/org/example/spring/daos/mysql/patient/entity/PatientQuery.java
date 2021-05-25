package org.example.spring.daos.mysql.patient.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.commons.entity.CommonsQuery;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientQuery extends CommonsQuery implements Serializable {

}