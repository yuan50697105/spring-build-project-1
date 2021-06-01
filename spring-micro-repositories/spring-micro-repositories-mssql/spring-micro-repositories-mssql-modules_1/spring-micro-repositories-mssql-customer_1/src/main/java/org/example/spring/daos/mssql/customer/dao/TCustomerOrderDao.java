package org.example.spring.daos.mssql.customer.dao;

import org.example.spring.daos.mssql.customer.table.po.TCustomerOrder;
import org.example.spring.daos.mssql.customer.table.query.TCustomerOrderQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerOrderDao extends TkBaseDao<TCustomerOrder, TCustomerOrderQuery> {
}
