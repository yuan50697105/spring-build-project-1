package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.daos.mysql.patient.table.po.TPatientFeeItem;
import org.example.spring.daos.mysql.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientFeeItemDao extends TkBaseDao<TPatientFeeItem, TPatientFeeItemQuery> {
}
