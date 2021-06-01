package org.example.spring.daos.postgres.customer.dao;

import org.example.spring.daos.postgres.customer.table.po.TSellerInfo;
import org.example.spring.daos.postgres.customer.table.query.TSellerInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TSellerInfoDao extends TkBaseDao<TSellerInfo, TSellerInfoQuery> {
}
