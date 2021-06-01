package org.example.spring.repositories.mssql.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mssql.patient.table.po.TPatientMeal;
import org.example.spring.repositories.mssql.patient.table.query.TPatientMealQuery;

import java.util.List;

public interface TPatientMealDao extends TkBaseDao<TPatientMeal, TPatientMealQuery> {
    boolean removeByTeamIds(List<Long> teamIds);
}
