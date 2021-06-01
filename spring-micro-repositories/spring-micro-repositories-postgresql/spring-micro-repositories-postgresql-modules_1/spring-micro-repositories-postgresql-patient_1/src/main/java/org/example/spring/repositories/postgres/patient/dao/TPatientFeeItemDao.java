package org.example.spring.repositories.postgres.patient.dao;

import org.example.spring.repositories.postgres.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientFeeItemDao extends TkBaseDao<TPatientFeeItem, TPatientFeeItemQuery> {
}
