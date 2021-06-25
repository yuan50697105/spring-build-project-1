package org.example.spring.repositories.customer.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerInfoQuery;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
