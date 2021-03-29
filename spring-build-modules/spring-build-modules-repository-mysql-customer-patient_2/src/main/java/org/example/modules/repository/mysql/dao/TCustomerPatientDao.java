package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TCustomerPatient;
import org.example.modules.repository.mysql.entity.query.TCustomerPatientQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerPatientDao extends TkBaseDao<TCustomerPatient, TCustomerPatientQuery> {
}
