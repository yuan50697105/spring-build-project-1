package org.example.spring.infrastructures.mysql.patient.dao;

import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientGroupDao extends TkBaseDao<TPatientGroup, TPatientGroupQuery> {
    boolean existById(Long id);
}
