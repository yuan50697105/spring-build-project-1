package org.example.spring.repositories.customer.oracle.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.customer.oracle.table.po.TSellerInfo;
import org.example.spring.repositories.customer.oracle.table.query.TSellerInfoQuery;

public interface TSellerInfoDao extends TkBaseDao<TSellerInfo, TSellerInfoQuery> {
}
