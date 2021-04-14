package org.example.spring.infrastructures.mysql.patient.dao;

import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TPatientTeamMealCheckItemDao extends TkBaseDao<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemQuery> {
}
