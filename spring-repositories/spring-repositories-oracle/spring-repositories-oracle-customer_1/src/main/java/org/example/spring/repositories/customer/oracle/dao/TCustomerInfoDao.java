package org.example.spring.repositories.customer.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.oracle.table.query.TCustomerInfoQuery;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
