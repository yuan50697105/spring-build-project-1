package org.example.spring.repositories.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.table.query.TPatientCheckItemQuery;

public interface TPatientCheckItemDao extends TkBaseDao<TPatientCheckItem, TPatientCheckItemQuery> {
}
