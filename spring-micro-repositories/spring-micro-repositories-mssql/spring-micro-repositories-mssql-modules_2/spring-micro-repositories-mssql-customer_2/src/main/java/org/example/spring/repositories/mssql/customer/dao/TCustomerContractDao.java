package org.example.spring.repositories.mssql.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mssql.customer.table.po.TCustomerContract;
import org.example.spring.repositories.mssql.customer.table.query.TCustomerContractQuery;

public interface TCustomerContractDao extends TkBaseDao<TCustomerContract, TCustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
