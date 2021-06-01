package org.example.spring.repositories.mssql.patient.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mssql.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.mssql.patient.table.query.TPatientTeamMealQuery;

public interface TPatientTeamMealDao extends TkBaseDao<TPatientTeamMeal, TPatientTeamMealQuery> {
}
