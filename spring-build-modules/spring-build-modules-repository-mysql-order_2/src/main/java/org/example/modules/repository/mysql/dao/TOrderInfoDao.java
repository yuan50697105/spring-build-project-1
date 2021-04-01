package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TOrderInfo;
import org.example.modules.repository.mysql.entity.query.TOrderInfoQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TOrderInfoDao extends TkBaseDao<TOrderInfo, TOrderInfoQuery> {
}
