package org.example.spring.repositories.patient.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.patient.mssql.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientTeamMealCheckItemQuery;

import java.util.List;

public interface TPatientTeamMealCheckItemDao extends TkBaseDao<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemQuery> {
    boolean removeByTeamMealIds(List<Long> ids);
}
