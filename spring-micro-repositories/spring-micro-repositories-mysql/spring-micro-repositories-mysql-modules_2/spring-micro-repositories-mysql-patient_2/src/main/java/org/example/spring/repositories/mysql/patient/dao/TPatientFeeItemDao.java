package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mysql.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientFeeItemQuery;

public interface TPatientFeeItemDao extends TkBaseDao<TPatientFeeItem, TPatientFeeItemQuery> {
}
