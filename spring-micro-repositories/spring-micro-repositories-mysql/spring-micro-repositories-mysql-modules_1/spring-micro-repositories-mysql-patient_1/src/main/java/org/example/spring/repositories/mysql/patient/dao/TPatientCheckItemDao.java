package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.daos.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.daos.mysql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientCheckItemDao extends TkBaseDao<TPatientCheckItem, TPatientCheckItemQuery> {
}
