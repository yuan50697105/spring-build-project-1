package org.example.spring.repositories.postgres.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.customer.table.po.TPotentialCustomers;
import org.example.spring.repositories.postgres.customer.table.query.TPotentialCustomersQuery;

public interface TPotentialCustomersDao extends TkBaseDao<TPotentialCustomers, TPotentialCustomersQuery> {
}