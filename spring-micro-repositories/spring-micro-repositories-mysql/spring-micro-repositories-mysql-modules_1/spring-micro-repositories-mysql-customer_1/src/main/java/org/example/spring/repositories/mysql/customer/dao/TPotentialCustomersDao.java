package org.example.spring.repositories.mysql.customer.dao;

import org.example.spring.repositories.mysql.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.mysql.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPotentialCustomersDao extends TkBaseDao<TPotentialCustomers, TPotentialCustomersQuery> {
}
