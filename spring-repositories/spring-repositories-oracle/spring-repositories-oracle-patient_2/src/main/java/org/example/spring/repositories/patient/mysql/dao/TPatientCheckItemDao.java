package org.example.spring.repositories.patient.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.mysql.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.mysql.table.query.TPatientCheckItemQuery;

public interface TPatientCheckItemDao extends TkBaseDao<TPatientCheckItem, TPatientCheckItemQuery> {
}
