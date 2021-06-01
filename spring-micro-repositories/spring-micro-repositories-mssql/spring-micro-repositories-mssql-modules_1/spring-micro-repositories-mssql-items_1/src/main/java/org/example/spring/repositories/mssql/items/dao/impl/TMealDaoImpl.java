package org.example.spring.repositories.mssql.items.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.repositories.mssql.items.dao.TMealDao;
import org.example.spring.repositories.mssql.items.mapper.TMealMapper;
import org.example.spring.repositories.mssql.items.table.po.TMeal;
import org.example.spring.repositories.mssql.items.table.query.TMealQuery;
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