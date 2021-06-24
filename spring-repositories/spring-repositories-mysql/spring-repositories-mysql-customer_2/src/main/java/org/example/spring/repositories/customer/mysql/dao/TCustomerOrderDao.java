package org.example.spring.repositories.customer.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerOrderQuery;

public interface TCustomerOrderDao extends TkBaseDao<TCustomerOrder, TCustomerOrderQuery> {
}
