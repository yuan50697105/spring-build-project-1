package org.example.spring.infrastructures.clickhouse.items.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.clickhouse.items.table.po.TMeal;
import org.example.spring.infrastructures.clickhouse.items.dao.TMealDao;
import org.example.spring.infrastructures.clickhouse.items.mapper.TMealMapper;
import org.example.spring.infrastructures.clickhouse.items.table.query.TMealQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TMealDaoImpl extends TkBaseDaoImpl<TMeal, TMealQuery, TMealMapper> implements TMealDao {
    @Override
    protected Wrapper<TMeal> queryWrapper(TMealQuery tMealQuery) {
        return null;
    }
}