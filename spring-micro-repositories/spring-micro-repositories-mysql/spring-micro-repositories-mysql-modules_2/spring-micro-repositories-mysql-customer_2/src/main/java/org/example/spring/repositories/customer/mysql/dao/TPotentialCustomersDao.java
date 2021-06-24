package org.example.spring.repositories.customer.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.mysql.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.mysql.table.query.TPotentialCustomersQuery;

public interface TPotentialCustomersDao extends TkBaseDao<TPotentialCustomers, TPotentialCustomersQuery> {
}
