package org.example.spring.infrastructures.postgresql.items.dao;

import org.example.spring.infrastructures.postgresql.items.table.po.TCheckItem;
import org.example.spring.infrastructures.postgresql.items.table.query.TCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
}