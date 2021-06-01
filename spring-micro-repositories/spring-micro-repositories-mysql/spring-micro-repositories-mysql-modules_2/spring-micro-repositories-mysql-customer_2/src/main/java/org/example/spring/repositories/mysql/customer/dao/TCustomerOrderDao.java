package org.example.spring.repositories.mysql.customer.dao;

import org.example.spring.repositories.mysql.customer.table.po.TCustomerOrder;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerOrderQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerOrderDao extends TkBaseDao<TCustomerOrder, TCustomerOrderQuery> {
}
