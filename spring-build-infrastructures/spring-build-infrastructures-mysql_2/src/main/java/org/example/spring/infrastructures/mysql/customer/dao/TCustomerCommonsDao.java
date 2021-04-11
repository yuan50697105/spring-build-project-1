package org.example.spring.infrastructures.mysql.customer.dao;

import org.example.spring.infrastructures.mysql.customer.table.po.TCustomerCommons;
import org.example.spring.infrastructures.mysql.customer.table.query.TCustomerCommonsQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;
import java.util.Optional;

public interface TCustomerCommonsDao extends TkBaseDao<TCustomerCommons, TCustomerCommonsQuery> {
    TCustomerCommons getByCustomerId(Long customerId);

    Optional<TCustomerCommons> getByCustomerIdOpt(Long customerId);

    boolean removeByCustomerIds(List<Long> ids);
}
