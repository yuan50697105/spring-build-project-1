package org.example.spring.daos.mssql.items.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mssql.items.dao.TMealFeeItemDao;
import org.example.spring.daos.mssql.items.mapper.TMealFeeItemMapper;
import org.example.spring.daos.mssql.items.table.po.TMealFeeItem;
import org.example.spring.daos.mssql.items.table.query.TMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.weekend.WeekendSqls;

import java.util.Arrays;
import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TMealFeeItemDaoImpl extends TkBaseDaoImpl<TMealFeeItem, TMealFeeItemQuery, TMealFeeItemMapper> implements TMealFeeItemDao {
    @Override
    protected Wrapper<TMealFeeItem> queryWrapper(TMealFeeItemQuery tMealFeeItemQuery) {
        return null;
    }

    @Override
    public boolean deleteByMealId(Long id) {
        return deleteByExample(exampleBuilder().where(WeekendSqls.<TMealFeeItem>custom().andEqualTo(TMealFeeItem::getMealId, id)).build());
    }

    @Override
    public boolean deleteByMealIds(Long... ids) {
        return deleteByMealIds(Arrays.asList(ids));
    }

    @Override
    public boolean deleteByMealIds(List<Long> ids) {
        return deleteByExample(exampleBuilder().where(WeekendSqls.<TMealFeeItem>custom().andIn(TMealFeeItem::getMealId, ids)).build());
    }

    @Override
    public boolean deleteByFeeItemId(Long id) {
        return deleteByExample(exampleBuilder().where(WeekendSqls.<TMealFeeItem>custom().andEqualTo(TMealFeeItem::getFeeItemId, id)).build());
    }

    @Override
    public boolean deleteByFeeItemIds(Long... ids) {
        return deleteByFeeItemIds(Arrays.asList(ids));
    }

    @Override
    public boolean deleteByFeeItemIds(List<Long> ids) {
        return deleteByExample(exampleBuilder().where(WeekendSqls.<TMealFeeItem>custom().andIn(TMealFeeItem::getFeeItemId, ids)).build());
    }
}