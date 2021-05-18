package org.example.spring.daos.mysql.items.dao;

import org.example.spring.daos.mysql.items.table.po.TFeeItem;
import org.example.spring.daos.mysql.items.table.query.TFeeItemQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TFeeItemDao extends TkBaseDao<TFeeItem, TFeeItemQuery> {
    List<TFeeItem> queryListByMealId(Long id);
}
