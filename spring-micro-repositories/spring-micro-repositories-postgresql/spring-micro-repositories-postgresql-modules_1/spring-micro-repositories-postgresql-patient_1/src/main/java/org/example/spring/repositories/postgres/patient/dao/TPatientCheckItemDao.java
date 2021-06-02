package org.example.spring.repositories.postgres.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientCheckItemQuery;

public interface TPatientCheckItemDao extends TkBaseDao<TPatientCheckItem, TPatientCheckItemQuery> {
}