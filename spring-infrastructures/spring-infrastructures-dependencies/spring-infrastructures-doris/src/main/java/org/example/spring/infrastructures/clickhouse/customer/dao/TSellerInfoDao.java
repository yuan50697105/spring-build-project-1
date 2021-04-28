package org.example.spring.infrastructures.clickhouse.customer.dao;

import org.example.spring.infrastructures.clickhouse.customer.table.po.TSellerInfo;
import org.example.spring.infrastructures.clickhouse.customer.table.query.TSellerInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TSellerInfoDao extends TkBaseDao<TSellerInfo, TSellerInfoQuery> {
}
