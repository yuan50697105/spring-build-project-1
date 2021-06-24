package org.example.spring.repositories.customer.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.mysql.table.po.TSellerInfo;
import org.example.spring.repositories.customer.mysql.table.query.TSellerInfoQuery;

public interface TSellerInfoDao extends TkBaseDao<TSellerInfo, TSellerInfoQuery> {
}
