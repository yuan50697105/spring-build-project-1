package org.example.spring.repositories.postgres.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.postgres.patient.table.po.TPatientMeal;
import org.example.spring.repositories.postgres.patient.table.query.TPatientMealQuery;

import java.util.List;

public interface TPatientMealDao extends TkBaseDao<TPatientMeal, TPatientMealQuery> {
    boolean removeByTeamIds(List<Long> teamIds);
}
