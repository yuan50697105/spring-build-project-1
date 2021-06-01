package org.example.spring.repositories.mysql.patient.dao;

import org.example.spring.daos.mysql.patient.table.po.TPatientMeal;
import org.example.spring.daos.mysql.patient.table.query.TPatientMealQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.mysql.patient.table.po.TPatientMeal;
import org.example.spring.repositories.mysql.patient.table.query.TPatientMealQuery;

import java.util.List;

public interface TPatientMealDao extends TkBaseDao<TPatientMeal, TPatientMealQuery> {
    boolean removeByTeamIds(List<Long> teamIds);
}
