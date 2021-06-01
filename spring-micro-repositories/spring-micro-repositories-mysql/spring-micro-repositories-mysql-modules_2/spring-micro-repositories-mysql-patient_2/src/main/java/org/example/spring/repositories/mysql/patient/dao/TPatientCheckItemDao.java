package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.daos.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.daos.mysql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientCheckItemQuery;

public interface TPatientCheckItemDao extends TkBaseDao<TPatientCheckItem, TPatientCheckItemQuery> {
}
