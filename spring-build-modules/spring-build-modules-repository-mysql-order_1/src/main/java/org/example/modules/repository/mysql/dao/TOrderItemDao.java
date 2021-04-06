package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TOrderItem;
import org.example.modules.repository.mysql.table.query.TOrderItemQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

public interface TOrderItemDao extends TkBaseDao<TOrderItem, TOrderItemQuery> {
}
