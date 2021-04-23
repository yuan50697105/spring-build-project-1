package org.example.spring.infrastructures.clickhouse.patient.dao;

import org.example.spring.infrastructures.clickhouse.patient.table.po.TPatientCheckItem;
import org.example.spring.infrastructures.clickhouse.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientCheckItemDao extends TkBaseDao<TPatientCheckItem, TPatientCheckItemQuery> {
}
