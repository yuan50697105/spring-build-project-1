package org.example.spring.daos.postgresql.items.dao;

import org.example.spring.daos.postgresql.items.table.po.TFeeItem;
import org.example.spring.daos.postgresql.items.table.query.TFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
}
