package org.example.spring.infrastructures.mysql.customer.dao;

import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerContract;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerContractDao extends TkBaseDao<TCustomerContract, TCustomerContractQuery> {
}
