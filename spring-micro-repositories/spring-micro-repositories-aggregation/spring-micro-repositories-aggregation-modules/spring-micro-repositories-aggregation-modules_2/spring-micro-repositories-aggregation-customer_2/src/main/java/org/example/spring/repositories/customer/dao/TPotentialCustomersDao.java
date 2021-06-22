package org.example.spring.repositories.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.table.query.TPotentialCustomersQuery;

public interface TPotentialCustomersDao extends TkBaseDao<TPotentialCustomers, TPotentialCustomersQuery> {
}
