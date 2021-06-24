package org.example.spring.repositories.patient.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMeal;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealQuery;

public interface TPatientTeamMealDao extends TkBaseDao<TPatientTeamMeal, TPatientTeamMealQuery> {
}
