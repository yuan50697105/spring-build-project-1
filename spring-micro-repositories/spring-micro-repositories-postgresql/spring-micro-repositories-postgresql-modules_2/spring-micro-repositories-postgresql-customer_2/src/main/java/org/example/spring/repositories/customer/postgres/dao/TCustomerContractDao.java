package org.example.spring.repositories.customer.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerContract;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerContractQuery;

public interface TCustomerContractDao extends TkBaseDao<TCustomerContract, TCustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
