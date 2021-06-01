package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.daos.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.daos.mysql.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.repositories.mysql.patient.table.query.TPatientTeamMealQuery;

public interface TPatientTeamMealDao extends TkBaseDao<TPatientTeamMeal, TPatientTeamMealQuery> {
}
