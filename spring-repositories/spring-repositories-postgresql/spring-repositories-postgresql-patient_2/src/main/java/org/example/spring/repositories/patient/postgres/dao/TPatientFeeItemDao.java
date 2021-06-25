package org.example.spring.repositories.patient.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.postgres.table.po.TPatientFeeItem;
import org.example.spring.repositories.patient.postgres.table.query.TPatientFeeItemQuery;

public interface TPatientFeeItemDao extends TkBaseDao<TPatientFeeItem, TPatientFeeItemQuery> {
}
