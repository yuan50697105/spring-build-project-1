package org.example.spring.daos.postgresql.items.dao;

import org.example.spring.daos.postgresql.items.table.po.TMealFeeItem;
import org.example.spring.daos.postgresql.items.table.query.TMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealFeeItemDao extends TkBaseDao<TMealFeeItem, TMealFeeItemQuery> {
}
