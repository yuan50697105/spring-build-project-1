package org.example.spring.repositories.items.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.items.mysql.dao.TMealDao;
import org.example.spring.repositories.items.mysql.mapper.TMealMapper;
import org.example.spring.repositories.items.mysql.table.po.TMeal;
import org.example.spring.repositories.items.mysql.table.query.TMealQuery;
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