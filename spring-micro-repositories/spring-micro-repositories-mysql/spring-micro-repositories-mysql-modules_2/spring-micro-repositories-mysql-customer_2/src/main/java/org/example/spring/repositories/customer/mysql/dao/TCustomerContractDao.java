package org.example.spring.repositories.customer.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.mysql.table.po.TCustomerContract;
import org.example.spring.repositories.customer.mysql.table.query.TCustomerContractQuery;

public interface TCustomerContractDao extends TkBaseDao<TCustomerContract, TCustomerContractQuery> {
    void updateFile(Long id, String fileName);
}
