package org.example.spring.repositories.postgres.patient.dao;

import org.example.spring.repositories.postgres.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.postgres.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamMealDao extends TkBaseDao<TPatientTeamMeal, TPatientTeamMealQuery> {
}
