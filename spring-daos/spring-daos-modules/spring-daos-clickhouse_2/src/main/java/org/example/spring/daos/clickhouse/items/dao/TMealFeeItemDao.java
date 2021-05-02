package org.example.spring.daos.clickhouse.items.dao;

import org.example.spring.daos.clickhouse.items.table.po.TMealFeeItem;
import org.example.spring.daos.clickhouse.items.table.query.TMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TMealFeeItemDao extends TkBaseDao<TMealFeeItem, TMealFeeItemQuery> {
}
