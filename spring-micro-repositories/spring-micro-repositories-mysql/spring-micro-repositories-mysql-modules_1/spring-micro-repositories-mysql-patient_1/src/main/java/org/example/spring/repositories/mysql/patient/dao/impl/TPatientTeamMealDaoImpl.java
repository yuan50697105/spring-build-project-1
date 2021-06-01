package org.example.spring.repositories.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.repositories.mysql.patient.mapper.TPatientTeamMealMapper;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.mysql.patient.dao.TPatientTeamMealDao;
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