package org.example.spring.repositories.aggregation.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.aggregation.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.aggregation.customer.table.query.TCustomerOrderQuery;

public interface TCustomerOrderDao extends TkBaseDao<TCustomerOrder, TCustomerOrderQuery> {
}
