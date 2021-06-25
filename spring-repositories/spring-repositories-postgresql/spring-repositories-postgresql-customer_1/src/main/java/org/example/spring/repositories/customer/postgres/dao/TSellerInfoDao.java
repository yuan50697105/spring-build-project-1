package org.example.spring.repositories.customer.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.postgres.table.po.TSellerInfo;
import org.example.spring.repositories.customer.postgres.table.query.TSellerInfoQuery;

public interface TSellerInfoDao extends TkBaseDao<TSellerInfo, TSellerInfoQuery> {
}
