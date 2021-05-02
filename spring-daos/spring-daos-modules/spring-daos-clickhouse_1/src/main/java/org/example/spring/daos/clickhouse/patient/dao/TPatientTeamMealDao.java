package org.example.spring.daos.clickhouse.patient.dao;

import org.example.spring.daos.clickhouse.patient.table.po.TPatientTeamMeal;
import org.example.spring.daos.clickhouse.patient.table.query.TPatientTeamMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamMealDao extends TkBaseDao<TPatientTeamMeal, TPatientTeamMealQuery> {
}
