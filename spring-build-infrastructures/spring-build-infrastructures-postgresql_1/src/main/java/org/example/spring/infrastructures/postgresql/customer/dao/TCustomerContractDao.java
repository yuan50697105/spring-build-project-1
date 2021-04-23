package org.example.spring.infrastructures.postgresql.customer.dao;

import org.example.spring.infrastructures.postgresql.customer.table.po.TCustomerContract;
import org.example.spring.infrastructures.postgresql.customer.table.query.TCustomerContractQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerContractDao extends TkBaseDao<TCustomerContract, TCustomerContractQuery> {
    void updateFile(Long id, String fileName);
}