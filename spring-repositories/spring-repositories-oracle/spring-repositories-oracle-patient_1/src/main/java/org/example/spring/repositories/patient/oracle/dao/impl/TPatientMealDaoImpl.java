package org.example.spring.repositories.patient.oracle.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.repositories.patient.oracle.dao.TPatientMealDao;
import org.example.spring.repositories.patient.oracle.mapper.TPatientMealMapper;
import org.example.spring.repositories.patient.oracle.table.po.TPatientMeal;
import org.example.spring.repositories.patient.oracle.table.query.TPatientMealQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TPatientMealDaoImpl extends TkBaseDaoImpl<TPatientMeal, TPatientMealQuery, TPatientMealMapper> implements TPatientMealDao {
    @Override
    protected Wrapper<TPatientMeal> queryWrapper(TPatientMealQuery tPatientMealQuery) {
        return null;
    }

    @Override
    public boolean removeByTeamIds(List<Long> teamIds) {
        return removeByIds(lambdaQuery().in(TPatientMeal::getTeamId, teamIds).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }
}