package org.example.spring.infrastructures.clickhouse.patient.dao;

import org.example.spring.infrastructures.clickhouse.patient.table.po.TPatientMeal;
import org.example.spring.infrastructures.clickhouse.patient.table.query.TPatientMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientMealDao extends TkBaseDao<TPatientMeal, TPatientMealQuery> {
    boolean removeByTeamIds(List<Long> teamIds);
}
