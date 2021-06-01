package org.example.spring.repositories.postgres.items.dao;

import org.example.spring.repositories.postgres.items.table.po.TFeeItem;
import org.example.spring.repositories.postgres.items.table.query.TFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
    List<TFeeItem> queryListByMealId(Long id);
}
