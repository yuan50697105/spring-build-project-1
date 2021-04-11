package org.example.spring.infrastructures.mysql.patient.dao;

import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupPatient;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupPatientQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientGroupPatientDao extends TkBaseDao<TPatientGroupPatient, TPatientGroupPatientQuery> {
}
