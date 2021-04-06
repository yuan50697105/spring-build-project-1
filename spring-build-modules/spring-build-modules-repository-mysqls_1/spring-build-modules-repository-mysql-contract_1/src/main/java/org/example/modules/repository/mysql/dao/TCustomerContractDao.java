package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TCustomerContract;
import org.example.modules.repository.mysql.table.query.TCustomerContractQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TCustomerContractDao extends TkBaseDao<TCustomerContract, TCustomerContractQuery> {
    List<TCustomerContract> queryListByCustomerId(Long id);
}