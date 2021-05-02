package org.example.spring.daos.clickhouse.items.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.clickhouse.items.dao.TFeeItemDao;
import org.example.spring.daos.clickhouse.items.mapper.TFeeItemMapper;
import org.example.spring.daos.clickhouse.items.table.po.TFeeItem;
import org.example.spring.daos.clickhouse.items.table.query.TFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TFeeItemDaoImpl extends TkBaseDaoImpl<TFeeItem, TFeeItemQuery, TFeeItemMapper> implements TFeeItemDao {
    @Override
    protected Wrapper<TFeeItem> queryWrapper(TFeeItemQuery tFeeItemQuery) {
        return null;
    }
}