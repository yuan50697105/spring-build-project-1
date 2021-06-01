package org.example.spring.daos.mssql.patient.dao;

import org.example.spring.daos.mssql.patient.table.po.TPatientFeeItem;
import org.example.spring.daos.mssql.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientFeeItemDao extends TkBaseDao<TPatientFeeItem, TPatientFeeItemQuery> {
}
