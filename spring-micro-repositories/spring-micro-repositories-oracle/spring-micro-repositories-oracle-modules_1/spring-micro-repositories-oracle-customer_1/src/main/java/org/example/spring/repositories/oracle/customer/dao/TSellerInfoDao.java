package org.example.spring.repositories.oracle.customer.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.oracle.customer.table.po.TSellerInfo;
import org.example.spring.repositories.oracle.customer.table.query.TSellerInfoQuery;

public interface TSellerInfoDao extends TkBaseDao<TSellerInfo, TSellerInfoQuery> {
}
