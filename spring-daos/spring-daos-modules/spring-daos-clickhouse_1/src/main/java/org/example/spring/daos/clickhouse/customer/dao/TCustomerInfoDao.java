package org.example.spring.daos.clickhouse.customer.dao;

import org.example.spring.daos.clickhouse.customer.table.po.TCustomerInfo;
import org.example.spring.daos.clickhouse.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
