package org.example.spring.repositories.clickhouse.customer.dao;

import org.example.spring.repositories.clickhouse.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.clickhouse.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
