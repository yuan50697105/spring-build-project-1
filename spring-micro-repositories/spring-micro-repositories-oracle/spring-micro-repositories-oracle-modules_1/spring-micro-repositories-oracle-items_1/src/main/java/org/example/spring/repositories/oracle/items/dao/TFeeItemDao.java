package org.example.spring.repositories.oracle.items.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.oracle.items.table.po.TFeeItem;
import org.example.spring.repositories.oracle.items.table.query.TFeeItemQuery;

import java.util.List;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
    List<TFeeItem> queryListByMealId(Long id);
}
