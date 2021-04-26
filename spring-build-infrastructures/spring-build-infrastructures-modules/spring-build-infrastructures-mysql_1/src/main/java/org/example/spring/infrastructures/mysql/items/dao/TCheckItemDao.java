package org.example.spring.infrastructures.mysql.items.dao;

import org.example.spring.infrastructures.mysql.items.table.po.TCheckItem;
import org.example.spring.infrastructures.mysql.items.table.query.TCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;

public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
}
