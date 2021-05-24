package org.example.spring.daos.mysql.customer.dao;

import org.example.spring.daos.mysql.customer.table.po.TCustomerOrder;
import org.example.spring.daos.mysql.customer.table.query.TCustomerOrderQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerOrderDao extends TkBaseDao<TCustomerOrder, TCustomerOrderQuery> {
}
