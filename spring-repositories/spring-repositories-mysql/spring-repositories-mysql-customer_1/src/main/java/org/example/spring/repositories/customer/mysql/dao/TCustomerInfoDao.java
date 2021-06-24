package org.example.spring.repositories.customer.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerInfoQuery;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
