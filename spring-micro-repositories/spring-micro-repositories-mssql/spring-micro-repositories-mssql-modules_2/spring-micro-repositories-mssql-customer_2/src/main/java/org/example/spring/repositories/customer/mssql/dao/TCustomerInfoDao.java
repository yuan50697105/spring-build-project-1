package org.example.spring.repositories.customer.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerInfoQuery;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
