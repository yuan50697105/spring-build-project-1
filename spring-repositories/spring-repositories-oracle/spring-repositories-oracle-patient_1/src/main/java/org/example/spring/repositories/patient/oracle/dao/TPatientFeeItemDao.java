package org.example.spring.repositories.patient.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.oracle.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.oracle.table.query.TPatientFeeItemQuery;

public interface TPatientFeeItemDao extends TkBaseDao<TPatientFeeItem, TPatientFeeItemQuery> {
}
