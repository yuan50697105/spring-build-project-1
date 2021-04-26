package org.example.spring.infrastructures.mysql.items.dao;

import org.example.spring.infrastructures.mysql.items.table.po.TFeeItem;
import org.example.spring.infrastructures.mysql.items.table.query.TFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
}
