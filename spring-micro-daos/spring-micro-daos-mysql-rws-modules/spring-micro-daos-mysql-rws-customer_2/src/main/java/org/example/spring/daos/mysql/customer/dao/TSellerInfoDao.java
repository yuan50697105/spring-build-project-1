package org.example.spring.daos.mysql.customer.dao;

import org.example.spring.daos.mysql.customer.table.po.TSellerInfo;
import org.example.spring.daos.mysql.customer.table.query.TSellerInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TSellerInfoDao extends TkBaseDao<TSellerInfo, TSellerInfoQuery> {
}
