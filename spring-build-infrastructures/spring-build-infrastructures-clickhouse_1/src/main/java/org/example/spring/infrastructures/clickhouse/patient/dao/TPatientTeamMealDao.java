package org.example.spring.infrastructures.clickhouse.patient.dao;

import org.example.spring.infrastructures.clickhouse.patient.table.po.TPatientTeamMeal;
import org.example.spring.infrastructures.clickhouse.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamMealDao extends TkBaseDao<TPatientTeamMeal, TPatientTeamMealQuery> {
}
