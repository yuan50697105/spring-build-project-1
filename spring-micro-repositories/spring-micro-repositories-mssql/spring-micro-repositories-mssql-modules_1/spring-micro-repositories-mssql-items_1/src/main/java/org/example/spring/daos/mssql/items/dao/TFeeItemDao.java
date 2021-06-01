package org.example.spring.daos.mssql.items.dao;

import org.example.spring.daos.mssql.items.table.po.TFeeItem;
import org.example.spring.daos.mssql.items.table.query.TFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
    List<TFeeItem> queryListByMealId(Long id);
}
