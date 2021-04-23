package org.example.spring.infrastructures.postgresql.patient.dao;

import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientCheckItem;
import org.example.spring.infrastructures.postgresql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientCheckItemDao extends TkBaseDao<TPatientCheckItem, TPatientCheckItemQuery> {
}
