package org.example.spring.infrastructures.mysql.patient.dao;

import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientGroupItemDao extends TkBaseDao<TPatientGroupItem, TPatientGroupItemQuery> {
}
