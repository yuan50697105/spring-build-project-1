package org.example.spring.infrastructures.mysql.patient.dao;

import org.example.spring.infrastructures.mysql.patient.table.po.TPatient;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientDao extends TkBaseDao<TPatient, TPatientQuery> {
}
