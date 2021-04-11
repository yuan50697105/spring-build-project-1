package org.example.spring.infrastructures.mysql.customer.dao;

import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerCommons;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerCommonsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerCommonsDao extends TkBaseDao<TCustomerCommons, TCustomerCommonsQuery> {
}
