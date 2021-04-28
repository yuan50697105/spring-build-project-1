package org.example.spring.infrastructures.clickhouse.patient.dao;

import org.example.spring.infrastructures.clickhouse.patient.table.po.TPatientFeeItem;
import org.example.spring.infrastructures.clickhouse.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientFeeItemDao extends TkBaseDao<TPatientFeeItem, TPatientFeeItemQuery> {
}
