package org.example.spring.infrastructures.clickhouse.items.dao;

import org.example.spring.infrastructures.clickhouse.items.table.po.TCheckItem;
import org.example.spring.infrastructures.clickhouse.items.table.query.TCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
}