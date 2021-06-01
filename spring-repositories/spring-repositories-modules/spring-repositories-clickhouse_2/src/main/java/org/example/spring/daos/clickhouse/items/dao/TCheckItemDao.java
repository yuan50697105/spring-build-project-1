package org.example.spring.repositories.clickhouse.items.dao;

import org.example.spring.repositories.clickhouse.items.table.po.TCheckItem;
import org.example.spring.repositories.clickhouse.items.table.query.TCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
}
