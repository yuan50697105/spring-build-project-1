package org.example.spring.repositories.customer.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.oracle.table.query.TCustomerOrderQuery;

public interface TCustomerOrderDao extends TkBaseDao<TCustomerOrder, TCustomerOrderQuery> {
}
