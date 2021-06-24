package org.example.spring.repositories.customer.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerOrderQuery;

public interface TCustomerOrderDao extends TkBaseDao<TCustomerOrder, TCustomerOrderQuery> {
}
