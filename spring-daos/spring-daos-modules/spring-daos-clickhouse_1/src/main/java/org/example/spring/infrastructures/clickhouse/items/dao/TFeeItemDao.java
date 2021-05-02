package org.example.spring.infrastructures.clickhouse.items.dao;

import org.example.spring.infrastructures.clickhouse.items.table.po.TFeeItem;
import org.example.spring.infrastructures.clickhouse.items.table.query.TFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
}
