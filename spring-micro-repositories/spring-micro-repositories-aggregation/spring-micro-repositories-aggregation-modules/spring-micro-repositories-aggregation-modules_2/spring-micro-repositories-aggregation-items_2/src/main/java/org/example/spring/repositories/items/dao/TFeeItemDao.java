package org.example.spring.repositories.items.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.items.table.po.TFeeItem;
import org.example.spring.repositories.items.table.query.TFeeItemQuery;

import java.util.List;

@SuppressWarnings("ALL")
public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
    List<TFeeItem> queryListByMealId(Long id);
}
