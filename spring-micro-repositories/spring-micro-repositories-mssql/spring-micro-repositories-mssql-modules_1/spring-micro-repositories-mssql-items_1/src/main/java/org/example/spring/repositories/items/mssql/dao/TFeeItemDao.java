package org.example.spring.repositories.items.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.items.mssql.table.po.TFeeItem;
import org.example.spring.repositories.items.mssql.table.query.TFeeItemQuery;

import java.util.List;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
    List<TFeeItem> queryListByMealId(Long id);
}
