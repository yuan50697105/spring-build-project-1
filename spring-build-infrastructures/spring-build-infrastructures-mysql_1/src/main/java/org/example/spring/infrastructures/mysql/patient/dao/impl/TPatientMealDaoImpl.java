package org.example.spring.infrastructures.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientMealDao;
import org.example.spring.infrastructures.mysql.patient.mapper.TPatientMealMapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientMeal;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientMealQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class TPatientMealDaoImpl extends TkBaseDaoImpl<TPatientMeal, TPatientMealQuery, TPatientMealMapper> implements TPatientMealDao {
    @Override
    protected Wrapper<TPatientMeal> queryWrapper(TPatientMealQuery tPatientMealQuery) {
        return null;
    }
}