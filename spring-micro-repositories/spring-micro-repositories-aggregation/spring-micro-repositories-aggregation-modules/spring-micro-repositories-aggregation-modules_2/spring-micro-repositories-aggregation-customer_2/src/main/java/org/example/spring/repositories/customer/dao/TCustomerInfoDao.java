package org.example.spring.repositories.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.table.query.TCustomerInfoQuery;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
