package org.example.spring.repositories.customer.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.postgres.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.postgres.table.query.TPotentialCustomersQuery;

public interface TPotentialCustomersDao extends TkBaseDao<TPotentialCustomers, TPotentialCustomersQuery> {
}
