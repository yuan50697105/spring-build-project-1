package org.example.spring.repositories.patient.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.mssql.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientFeeItemQuery;

public interface TPatientFeeItemDao extends TkBaseDao<TPatientFeeItem, TPatientFeeItemQuery> {
}
