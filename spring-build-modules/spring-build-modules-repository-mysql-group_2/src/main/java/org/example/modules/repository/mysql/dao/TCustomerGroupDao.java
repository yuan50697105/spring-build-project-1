package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TCustomerGroup;
import org.example.modules.repository.mysql.entity.query.TCustomerGroupQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerGroupDao extends TkBaseDao<TCustomerGroup, TCustomerGroupQuery> {
}
