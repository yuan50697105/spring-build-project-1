package org.example.spring.daos.postgresql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.postgresql.patient.dao.TPatientTeamMealDao;
import org.example.spring.daos.postgresql.patient.mapper.TPatientTeamMealMapper;
import org.example.spring.daos.postgresql.patient.table.po.TPatientTeamMeal;
import org.example.spring.daos.postgresql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientTeamMealDaoImpl extends TkBaseDaoImpl<TPatientTeamMeal, TPatientTeamMealQuery, TPatientTeamMealMapper> implements TPatientTeamMealDao {
    @Override
    protected Wrapper<TPatientTeamMeal> queryWrapper(TPatientTeamMealQuery tPatientTeamMealQuery) {
        return null;
    }
}