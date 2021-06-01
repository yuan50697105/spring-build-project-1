package org.example.spring.repositories.clickhouse.items.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.repositories.clickhouse.items.dao.TMealFeeItemDao;
import org.example.spring.repositories.clickhouse.items.mapper.TMealFeeItemMapper;
import org.example.spring.repositories.clickhouse.items.table.po.TMealFeeItem;
import org.example.spring.repositories.clickhouse.items.table.query.TMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TMealFeeItemDaoImpl extends TkBaseDaoImpl<TMealFeeItem, TMealFeeItemQuery, TMealFeeItemMapper> implements TMealFeeItemDao {
    @Override
    protected Wrapper<TMealFeeItem> queryWrapper(TMealFeeItemQuery tMealFeeItemQuery) {
        return null;
    }
}