package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TCustomerInfo;
import org.example.modules.repository.mysql.table.query.TCustomerInfoQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TCustomerInfoDao extends TkBaseDao<TCustomerInfo, TCustomerInfoQuery> {
}
