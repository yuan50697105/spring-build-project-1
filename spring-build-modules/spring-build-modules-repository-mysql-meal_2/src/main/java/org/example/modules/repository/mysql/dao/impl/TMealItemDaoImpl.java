package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TMealItemDao;
import org.example.modules.repository.mysql.mapper.TMealItemMapper;
import org.example.modules.repository.mysql.table.po.TMealItem;
import org.example.modules.repository.mysql.table.query.TMealItemQuery;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@AllArgsConstructor
public class TMealItemDaoImpl extends TkBaseDaoImpl<TMealItem, TMealItemQuery, TMealItemMapper> implements TMealItemDao {
    @Override
    protected Wrapper<TMealItem> queryWrapper(TMealItemQuery tMealItemQuery) {
        return null;
    }

    @Override
    public List<TMealItem> listByMealId(Long mealId) {
        return lambdaQuery().eq(TMealItem::getMealId,mealId).list();
    }
}