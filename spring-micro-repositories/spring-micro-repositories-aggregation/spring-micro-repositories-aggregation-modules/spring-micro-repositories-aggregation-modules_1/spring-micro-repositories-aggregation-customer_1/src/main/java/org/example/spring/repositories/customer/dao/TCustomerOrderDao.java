package org.example.spring.repositories.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.table.query.TCustomerOrderQuery;

public interface TCustomerOrderDao extends TkBaseDao<TCustomerOrder, TCustomerOrderQuery> {
}
