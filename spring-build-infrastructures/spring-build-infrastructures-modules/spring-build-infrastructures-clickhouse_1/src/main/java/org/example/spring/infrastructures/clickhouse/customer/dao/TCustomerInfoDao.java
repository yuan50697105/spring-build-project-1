package org.example.spring.infrastructures.clickhouse.customer.dao;

import org.example.spring.infrastructures.clickhouse.customer.table.po.TCustomerInfo;
import org.example.spring.infrastructures.clickhouse.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
