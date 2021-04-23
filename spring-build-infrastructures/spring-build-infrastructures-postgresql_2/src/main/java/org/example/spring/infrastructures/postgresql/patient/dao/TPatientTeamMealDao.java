package org.example.spring.infrastructures.postgresql.patient.dao;

import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientTeamMeal;
import org.example.spring.infrastructures.postgresql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamMealDao extends TkBaseDao<TPatientTeamMeal, TPatientTeamMealQuery> {
}
