package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TOrderItem;
import org.example.modules.repository.mysql.entity.query.TOrderItemQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TOrderItemDao extends TkBaseDao<TOrderItem, TOrderItemQuery> {
}
