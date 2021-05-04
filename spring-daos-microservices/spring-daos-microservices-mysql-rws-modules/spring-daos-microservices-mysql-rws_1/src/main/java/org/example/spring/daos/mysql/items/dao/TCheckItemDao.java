package org.example.spring.daos.mysql.items.dao;

import org.example.spring.daos.mysql.items.table.po.TCheckItem;
import org.example.spring.daos.mysql.items.table.query.TCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TCheckItemDao extends TkBaseDao<TCheckItem, TCheckItemQuery> {
}
