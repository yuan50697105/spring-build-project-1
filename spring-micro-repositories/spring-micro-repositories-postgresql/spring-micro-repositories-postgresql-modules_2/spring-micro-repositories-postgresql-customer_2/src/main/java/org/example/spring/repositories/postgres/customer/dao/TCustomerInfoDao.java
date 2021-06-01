package org.example.spring.repositories.postgres.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.postgres.customer.table.query.TCustomerInfoQuery;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
