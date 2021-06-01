package org.example.spring.daos.mssql.customer.dao;

import org.example.spring.daos.mssql.customer.table.po.TPotentialCustomers;
import org.example.spring.daos.mssql.customer.table.query.TPotentialCustomersQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPotentialCustomersDao extends TkBaseDao<TPotentialCustomers, TPotentialCustomersQuery> {
}
