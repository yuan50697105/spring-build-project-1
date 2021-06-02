package org.example.spring.repositories.mysql.customer.dao;

import org.example.spring.repositories.mysql.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
