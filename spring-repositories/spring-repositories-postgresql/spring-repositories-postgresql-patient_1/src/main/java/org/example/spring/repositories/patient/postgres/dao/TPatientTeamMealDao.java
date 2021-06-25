package org.example.spring.repositories.patient.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.postgres.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.postgres.table.query.TPatientTeamMealQuery;

public interface TPatientTeamMealDao extends TkBaseDao<TPatientTeamMeal, TPatientTeamMealQuery> {
}
