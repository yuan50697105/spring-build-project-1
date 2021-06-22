package org.example.spring.repositories.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.table.po.TSellerInfo;
import org.example.spring.repositories.customer.table.query.TSellerInfoQuery;

public interface TSellerInfoDao extends TkBaseDao<TSellerInfo, TSellerInfoQuery> {
}
