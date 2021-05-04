package org.example.spring.daos.mysql.customer.dao;

import org.example.spring.daos.mysql.customer.table.po.TPotentialCustomers;
import org.example.spring.daos.mysql.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPotentialCustomersDao extends TkBaseDao<TPotentialCustomers, TPotentialCustomersQuery> {
}
