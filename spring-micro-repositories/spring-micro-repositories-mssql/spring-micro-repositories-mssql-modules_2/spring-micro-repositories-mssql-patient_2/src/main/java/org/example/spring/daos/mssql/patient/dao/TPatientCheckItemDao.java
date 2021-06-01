package org.example.spring.daos.mssql.patient.dao;

import org.example.spring.daos.mssql.patient.table.po.TPatientCheckItem;
import org.example.spring.daos.mssql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientCheckItemDao extends TkBaseDao<TPatientCheckItem, TPatientCheckItemQuery> {
}
