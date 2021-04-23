package org.example.spring.infrastructures.clickhouse.customer.dao;

import org.example.spring.infrastructures.clickhouse.customer.table.po.TCustomerContract;
import org.example.spring.infrastructures.clickhouse.customer.table.query.TCustomerContractQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerContractDao extends TkBaseDao<TCustomerContract, TCustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
