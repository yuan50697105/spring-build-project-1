package org.example.spring.repositories.clickhouse.items.dao;

import org.example.spring.repositories.clickhouse.items.table.po.TFeeItem;
import org.example.spring.repositories.clickhouse.items.table.query.TFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
}
